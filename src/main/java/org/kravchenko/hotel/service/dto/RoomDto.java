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
public class RoomDto {

    List<Client> clients;
    private Long id;
    private int price;
    private int capacity;
    private int rating;
    private boolean isOccupied;
    private boolean isInService;

}
