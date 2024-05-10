package org.kravchenko.hotel.controller;

import org.kravchenko.hotel.service.dto.ClientDto;
import org.kravchenko.hotel.service.dto.ServicePriceDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("api/hotel/clients")
public interface ClientController {

    @GetMapping("/find")
    ClientDto findClient(@RequestParam Long id);

    @GetMapping("/services")
    List<ServicePriceDto> getClientServices(@RequestParam Long id);

    @PutMapping("/add")
    void addClient(@RequestBody ClientDto clientDto);

    @DeleteMapping("/delete")
    void deleteClient(@RequestParam Long id);

}
