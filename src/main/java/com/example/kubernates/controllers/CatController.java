package com.example.kubernates.controllers;

import com.example.kubernates.dto.CatDto;
import com.example.kubernates.entities.Cat;
import com.example.kubernates.services.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
