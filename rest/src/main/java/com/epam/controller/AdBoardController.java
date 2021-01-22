package com.epam.controller;

import com.epam.model.Advertisement;
//import com.epam.service.AdverismentService;
import com.epam.service.AdverismentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adv")
public class AdBoardController {
    AdverismentService adverismentService;

    @Autowired
    public AdBoardController(AdverismentService adverismentService) {
        this.adverismentService = adverismentService;
    }

    @GetMapping
    private List<Advertisement> getAllAd() {
        return adverismentService.getAll();
    }

    @PostMapping("/save")
    private Advertisement saveAd(@RequestParam(value = "name", defaultValue = "0") String name,
                                 @RequestParam(value = "email", defaultValue = "0") String email,
                                 @RequestParam(value = "text", defaultValue = "0") String text) {
        return adverismentService.save(new Advertisement(name, email, text));
    }

    @PutMapping("/update")
    private Advertisement updateAd(@RequestParam(value = "id", defaultValue = "-1") String id,
                                   @RequestParam(value = "name", defaultValue = "0") String name,
                                   @RequestParam(value = "email", defaultValue = "0") String email,
                                   @RequestParam(value = "text", defaultValue = "0") String text) throws NotFoundException {
        if (Long.parseLong(id) == -1)
            throw new NotFoundException(id);
        return adverismentService.update(Long.parseLong(id), new Advertisement(name, email, text));
    }

    @DeleteMapping("/delete")
    private void updateAd(@RequestParam(value = "id", defaultValue = "-1") String id) throws NotFoundException {
        if (Long.parseLong(id) == -1)
            throw new NotFoundException(id);
        adverismentService.delete(Long.parseLong(id));
    }
}
