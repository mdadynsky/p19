package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityDao cityDao;

    public CityService(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public List<City> getCityList() {
        return cityDao.getCityList();
    }

    public City getCityById(Integer cityId) {
        return cityDao.getCityById(cityId);
    }

    public void deleteCity(Integer cityId) {
        cityDao.deleteCity(cityId);
    }

    public void save(City city) {
        if (city.getId() == null)
            cityDao.insert(city);
        else
            cityDao.update(city);
    }
}
