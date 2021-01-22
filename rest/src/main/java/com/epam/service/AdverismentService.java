package com.epam.service;


import com.epam.model.Advertisement;
import com.epam.repository.AdvertisementCrudRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdverismentService {
    private AdvertisementCrudRepository advertismentCrudRepository;

    public Optional<Advertisement> getById(Long id) {
        return advertismentCrudRepository.findById(id);
    }

    public List<Advertisement> getAll() {
        return advertismentCrudRepository.findAllByOrderByIdDesc();
    }

    public Advertisement save(Advertisement ad) {
        advertismentCrudRepository.save(ad);
        return ad;
    }

    public void delete(Long id) {
        advertismentCrudRepository.deleteById(id);
    }

    public Advertisement update(Long id,Advertisement ad) throws NotFoundException {
        if (!advertismentCrudRepository.existsById(id)) {
            throw new NotFoundException(id.toString());
        }
        ad.setId(id);
        return advertismentCrudRepository.save(ad);
    }


    @Autowired
    public AdverismentService(AdvertisementCrudRepository advertismentCrudRepository) {
        this.advertismentCrudRepository = advertismentCrudRepository;
    }

}
