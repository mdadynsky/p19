package com.example.demo.web.admin.producer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Автор: Евгений Копылов
 * Список производителей
 */
@Controller
public class ProducerController {

    @GetMapping("/admin/producer/producers")
    public String showProducerList() {
        return "admin/producer/producers";
    }

}
