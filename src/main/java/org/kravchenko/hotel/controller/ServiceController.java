package org.kravchenko.hotel.controller;

import org.kravchenko.hotel.service.dto.ServiceDto;
import org.kravchenko.hotel.service.dto.ServicePriceDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("api/hotel/service")
public interface ServiceController {

    @GetMapping("/all/price")
    List<ServicePriceDto> getAllServicesWithPrice();

    @PutMapping
    void saveService(@RequestBody ServiceDto serviceDto);

    @PostMapping
    void servicePriceUpdate(@RequestParam Long id, @RequestParam int price);

}
