package org.kravchenko.hotel.service.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kravchenko.hotel.model.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ClientDto {

    private Long id;

    private String name;

    private String surname;

    private List<Service> services;

}
