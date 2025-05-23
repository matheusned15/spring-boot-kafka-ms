package com.example.api.service.impl;


import com.example.api.client.CarPostStoreClient;
import com.example.api.dto.CarPostDTO;
import com.example.api.service.CarPostStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPost, String id) {
        carPostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSale(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
    }
}

