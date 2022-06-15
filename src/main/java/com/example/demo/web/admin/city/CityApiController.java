package com.example.demo.web.admin.city;

import com.example.demo.model.City;
import com.example.demo.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityApiController {
    private final CityService cityService;

    public CityApiController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping("/api/city")
    public List<City> getCity() {
        return cityService.getCityList();
    }
}
