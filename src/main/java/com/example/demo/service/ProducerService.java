package com.example.demo.service;

import com.example.demo.dao.ProducerDao;
import com.example.demo.model.Producer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProducerService {
    private ProducerDao producerDao;

    public ProducerService(ProducerDao producerDao){
        this.producerDao = producerDao;
    }

    public List<Map<String, Object>> getProducers() {
        return producerDao.getProducers();
    }

    public List<Producer> getProducerList() {
        return producerDao.getProducerList();
    }
}
