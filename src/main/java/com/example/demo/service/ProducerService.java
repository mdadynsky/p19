package com.example.demo.service;

import com.example.demo.dao.ProducerDao;
import com.example.demo.model.Producer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProducerService {
    private final ProducerDao producerDao;

    public ProducerService(ProducerDao producerDao) {
        this.producerDao = producerDao;
    }

    public List<Map<String, Object>> getProducers() {
        return producerDao.getProducers();
    }

    public List<Producer> getProducerList() {
        return producerDao.getProducerList();
    }

    public Producer getProducerById(Integer producerId) {
        return producerDao.getProducerById(producerId);
    }

    public Producer getProducerByName(String producerName) {
        return producerDao.getProducerByName((producerName));
    }

    public void deleteProducer(Integer producerId) {
        producerDao.deleteProducer(producerId);
    }

    public void save(Producer producer) {
        if (producer.getId() == null)
            producerDao.insert(producer);
        else
            producerDao.update(producer);
    }
}
