package org.kravchenko.hotel.service.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kravchenko.hotel.model.Client;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ServiceDto {

    private Long id;

    private String name;

    private String description;

    private int price;

    private List<Client> clients;

}
