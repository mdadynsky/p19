package com.example.demo.web.admin.producer;

import com.example.demo.dao.ProducerDao;
import com.example.demo.model.Producer;
import com.example.demo.service.ProducerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * Автор: Евгений Копылов
 * Список производителей
 */
@Controller
public class ProducerController {

    private ProducerService producerService;

    private ProducerController(ProducerService producerService, ProducerDao producerDao) {
        this.producerService = producerService;
    }

    @GetMapping("/admin/producer/producers")
    public String showProducerList(Model model) {
        List<Map<String, Object>> listOfMaps = producerService.getProducers();
        List<Producer> producers = producerService.getProducerList();

        model.addAttribute("producers", producers);
        return "admin/producer/producers";
    }

}
