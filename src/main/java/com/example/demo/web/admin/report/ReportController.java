package com.example.demo.web.admin.report;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Controller
public class ReportController {

    @GetMapping("/admin/report/geoChat")
    public String geoChart(Model model){
        Random randNumber = new Random();
        List countries = new ArrayList();

        countries.add( new ReportCountry("Germany", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("US", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("Brazil", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("Canada", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("France", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("CG", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("NE", randNumber.nextInt(1000) ) );
        countries.add( new ReportCountry("RU", randNumber.nextInt(1000) ) );

        model.addAttribute("countries", countries);

        return "admin/report/geoChat";
    }

    @GetMapping("/admin/report/intervals")
    public String intervals() {
        return "admin/report/intervals";
    }

    @GetMapping("/admin/report/donut")
    public String donut() {
        return "admin/report/donut";
    }

}
