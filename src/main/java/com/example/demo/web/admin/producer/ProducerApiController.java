package com.example.demo.web.admin.producer;

import com.example.demo.model.Producer;
import com.example.demo.service.ProducerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/producer")
public class ProducerApiController {

    private final ProducerService producerService;

    public ProducerApiController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @RequestMapping(value = "/producers")
    public List<Producer> getProducers() {
        return producerService.getProducerList();
    }

}
