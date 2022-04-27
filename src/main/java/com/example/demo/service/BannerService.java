package com.example.demo.service;

import com.example.demo.dao.BannerDao;
import com.example.demo.model.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {
    private final BannerDao bannerDao;

    public BannerService(BannerDao bannerDao) {
        this.bannerDao = bannerDao;
    }

    public List<Banner> getBannerList() {
        return bannerDao.getBannerList();
    }
}
