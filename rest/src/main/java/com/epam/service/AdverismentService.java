package com.epam.service;


import com.epam.model.Advertisement;
import com.epam.repository.AdvertismentCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdverismentService {
    private AdvertismentCrudRepository advertismentCrudRepository;

    public Optional<Advertisement> getAdById(Long id){
        return advertismentCrudRepository.findById(id);
    }
//    public Optional<Advertisement> getAllAd(){
//        return advertismentCrudRepository.findAll();
//    }

    public Advertisement saveAd(Advertisement ad){
        advertismentCrudRepository.save(ad);
        return ad;
    }
    @Autowired
    public AdverismentService(AdvertismentCrudRepository advertismentCrudRepository) {
        this.advertismentCrudRepository = advertismentCrudRepository;
    }

}
