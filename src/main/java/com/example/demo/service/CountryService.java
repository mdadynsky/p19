package com.example.demo.service;

import com.example.demo.dao.CountryDao;
import com.example.demo.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryDao countryDao;

    public CountryService(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public List<Country> getCountryList() {
        return countryDao.getCountryList();
    }

    public Country getCountryById(Integer countryId) {
        return countryDao.getCountryById(countryId);
    }

    public void deleteCountry(Integer countryId) {
        countryDao.deleteCountry(countryId);
    }

    public void save(Country country) {
        if (country.getId() == null)
            countryDao.insert(country);
        else
            countryDao.update(country);
    }
}
