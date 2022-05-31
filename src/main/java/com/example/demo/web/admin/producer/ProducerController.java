package com.example.demo.web.admin.producer;

import com.example.demo.model.Producer;
import com.example.demo.service.ProducerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Автор: Евгений Копылов
 * Список производителей
 */
@Controller
public class ProducerController {

    private final ProducerService producerService;

    private ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/admin/producer/producers")
    public String showProducerList(Model model, HttpSession session) {
        session.setAttribute("v1", "Hello");
        List<Map<String, Object>> listOfMaps = producerService.getProducers();
        List<Producer> producers = producerService.getProducerList();

        model.addAttribute("producers", producers);
        return "admin/producer/producers";
    }

    /**
     * Удаление производителя с спользованием RequestParam
     * /admin/producer/edit?producerId=${producer.id}
     *
     * @param producerId
     * @return
     */
    @GetMapping("/admin/producer/delete")
    public String deleteProducer(@RequestParam Integer producerId) {
        producerService.deleteProducer(producerId);
        return "redirect:/admin/producer/producers";
    }

    @GetMapping("/admin/producer/{producerId}/delete")
    public String deleteProducer2(@PathVariable Integer producerId) {
        producerService.deleteProducer(producerId);
        return "redirect:/admin/producer/producers";
    }

    @GetMapping("/admin/producer/producers-ajax")
    public String showProducerList2() {
        return "admin/producer/producers2";
    }

    @GetMapping("/admin/producer/create")
    public String showCreate(Model model, HttpSession session) {
        String v1 = (String) session.getAttribute("v1");

        model.addAttribute("producer", new Producer());
        model.addAttribute("v1", v1);
        return "admin/producer/editproducer";
    }

    @GetMapping("/admin/producer/{producerId}/edit")
    public String showProducerEdit(@PathVariable Integer producerId, Model model) {
        Producer producer = producerService.getProducerById(producerId);
        model.addAttribute("producer", producer);
        return "admin/producer/editproducer";
    }

    @PostMapping("/admin/producer/{producerId}/edit")
    public String saveProducerEdit(
            @ModelAttribute Producer producer,
            @PathVariable Integer producerId) {
        producer.setId(producerId);
        System.out.println("Сохранение производителя " + producerId);

        producerService.save(producer);
        return "redirect:/admin/producer/producers";
    }

    @PostMapping("/admin/producer/create")
    public String saveProducerEdit(
            @ModelAttribute Producer producer) {
        producerService.save(producer);
        return "redirect:/admin/producer/producers";
    }
}
