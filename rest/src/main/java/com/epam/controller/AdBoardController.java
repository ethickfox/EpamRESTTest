package com.epam.controller;

import com.epam.model.Advertisement;
//import com.epam.service.AdverismentService;
import com.epam.service.AdverismentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdBoardController {
    AdverismentService adverismentService;

    @Autowired
    public AdBoardController(AdverismentService adverismentService) {
        this.adverismentService = adverismentService;
    }

    @GetMapping("/ad")
    private Advertisement getAdById(@RequestParam(value = "id", defaultValue = "0") String id) {
        return adverismentService.getAdById(Long.parseLong(id)).orElse(new Advertisement("","",""));
    }
//    @GetMapping("/ad")
//    private Advertisement getAllAd() {
//        return adverismentService.getAdById(Long.parseLong(id)).orElse(new Advertisement("","",""));
//    }
    @PutMapping("/ad")
    private Advertisement saveAd(@RequestParam(value = "name", defaultValue = "0") String name,
                                 @RequestParam(value = "email", defaultValue = "0") String email,
                                 @RequestParam(value = "text", defaultValue = "0") String text) {
        return adverismentService.saveAd(new Advertisement(name,email,text));
    }
//    @GetMapping("/ad")
//    private Advertisement getAllAd() {
//        return adverismentService.getALong.parseLong(id)).orElse(new Advertisement("","",""));
//    }
}
