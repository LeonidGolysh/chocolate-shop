package com.goit.tests.feature.chocolate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ChocolateService {
    private final ChocolateRepository repository;

    public List<Chocolate> findAll() {
        return  repository.findAll();
    }

    public void createFromDto(ChocolateDto dto) {
        Chocolate chocolate = new Chocolate();
        chocolate.setType(dto.getType());
        chocolate.setDescription(dto.getDescription());
        repository.save(chocolate);
    }

    public void updateFromDto(ChocolateDto dto) {
        Chocolate chocolate = repository.findById(dto.getType()).orElseThrow();
        chocolate.setDescription(dto.getDescription());
        repository.save(chocolate);
    }

    public void deleteFromDto(String type) {
        repository.deleteById(type);
    }

    public boolean exists(String type) {
        if (type == null) {
            return false;
        }
        return repository.existsById(type);
    }
}
