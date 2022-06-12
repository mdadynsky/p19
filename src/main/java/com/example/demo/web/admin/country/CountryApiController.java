package com.example.demo.web.admin.country;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/country")
public class CountryApiController {

    private final CountryService countryService;

    public CountryApiController(CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping(value = "/country")
    public List<Country> getCountry() {
        return countryService.getCountryList();
    }
}
