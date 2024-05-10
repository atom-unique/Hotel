package org.kravchenko.hotel.controller.impl;

import lombok.RequiredArgsConstructor;
import org.kravchenko.hotel.controller.ClientController;
import org.kravchenko.hotel.service.ClientService;
import org.kravchenko.hotel.service.dto.ClientDto;
import org.kravchenko.hotel.service.dto.ServicePriceDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClientControllerImpl implements ClientController {

    private final ClientService clientService;

    @Override
    public ClientDto findClient(Long id) {
        return clientService.findClient(id);
    }

    @Override
    public List<ServicePriceDto> getClientServices(Long id) {
        return clientService.getClientServices(id);
    }

    @Override
    public void addClient(ClientDto clientDto) {
        clientService.addClient(clientDto);
    }

    @Override
    public void deleteClient(Long id) {
        clientService.deleteClient(id);
    }

}
