package com.example.demo.web.admin.city;

import com.example.demo.model.City;
import com.example.demo.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Список городов
 * Автор: Ануфриев Илья
 */
@Controller
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/admin/city/city")
    public String showCities(Model model) {
        List<City> cities = cityService.getCityList();
        model.addAttribute("cities", cities);
        return "admin/city/city";
    }

    @GetMapping("/admin/city/{cityId}/delete")
    public String deleteCity(@PathVariable Integer cityId) {
        cityService.deleteCity(cityId);
        return "redirect:/admin/city/city";
    }

    @GetMapping("/admin/city/create")
    public String showCreate(Model model) {

        model.addAttribute("city", new City());
        return "admin/city/editcity";
    }

    @GetMapping("/admin/city/{cityId}/edit")
    public String showcityEdit(@PathVariable Integer cityId, Model model) {
        City city = cityService.getCityById(cityId);
        model.addAttribute("city", city);
        return "admin/city/editcity";
    }

    @PostMapping("/admin/city/{cityId}/edit")
    public String savecityEdit(
            @ModelAttribute City city,
            @PathVariable Integer cityId) {
        city.setId(cityId);
        System.out.println("Сохранние пользователя " + cityId);

        cityService.save(city);
        return "redirect:/admin/city/city";
    }

    @PostMapping("/admin/city/create")
    public String savecityEdit(
            @ModelAttribute City city) {
        cityService.save(city);
        return "redirect:/admin/city/city";
    }
}
