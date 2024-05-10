package org.kravchenko.hotel.controller.impl;

import lombok.RequiredArgsConstructor;
import org.kravchenko.hotel.controller.ServiceController;
import org.kravchenko.hotel.service.ServiceService;
import org.kravchenko.hotel.service.dto.ServiceDto;
import org.kravchenko.hotel.service.dto.ServicePriceDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ServiceControllerImpl implements ServiceController {

    private final ServiceService service;

    @Override
    public List<ServicePriceDto> getAllServicesWithPrice() {
        return service.getAllServicesWithPrice();
    }

    @Override
    public void saveService(ServiceDto serviceDto) {
        service.addService(serviceDto);
    }

    @Override
    public void servicePriceUpdate(Long id, int price) {
        service.servicePriceUpdate(id, price);
    }

}
