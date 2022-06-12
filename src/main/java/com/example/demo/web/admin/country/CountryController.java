package com.example.demo.web.admin.country;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
/**
 * Список стран
 * Автор: Александр Усков
 */
@Controller
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/admin/country/country")
    public String showCountryList(Model model) {
        List<Country> country = countryService.getCountryList();
        model.addAttribute("country", country);
        return ("/admin/country/country");
    }

    @GetMapping("/admin/country/{countryId}/delete")
    public String deleteCountry(@PathVariable Integer countryId) {
        countryService.deleteCountry(countryId);
        return "redirect:/admin/country/country";
    }

    @GetMapping("/admin/country/create")
    public String showCreate(Model model) {

        model.addAttribute("country", new Country());
        return "admin/country/editcountry";
    }

    @GetMapping("/admin/country/{countryId}/edit")
    public String showCountryEdit(@PathVariable Integer countryId, Model model) {
        Country country = countryService.getCountryById(countryId);
        model.addAttribute("country", country);
        return "admin/country/editcountry";
    }

    @PostMapping("/admin/country/{countryId}/edit")
    public String saveCountryEdit(
            @ModelAttribute Country country,
            @PathVariable Integer countryId) {
        country.setId(countryId);
        System.out.println("Сохранить компанию " + countryId);

        countryService.save(country);
        return "redirect:/admin/country/country";
    }

    @PostMapping("/admin/country/create")
    public String saveCountryEdit(
            @ModelAttribute Country country) {
        countryService.save(country);
        return "redirect:/admin/country/country";
    }
}
