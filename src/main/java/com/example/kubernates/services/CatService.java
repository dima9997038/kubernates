package com.example.kubernates.services;

import com.example.kubernates.dto.CatDto;
import com.example.kubernates.entities.Cat;
import com.example.kubernates.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        Cat cat = new Cat()
                .setName(catDto.getName())
                .setBirthDay(catDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
