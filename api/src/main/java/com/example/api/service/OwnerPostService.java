package com.example.api.service;

import com.example.api.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostService {
    void createOwnerCar(OwnerPostDTO ownerPostDTO);
}

