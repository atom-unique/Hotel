package org.kravchenko.hotel.service.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.kravchenko.hotel.model.Client;
import org.kravchenko.hotel.model.Employee;
import org.kravchenko.hotel.model.Room;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class RecordDto {

    private Long id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private boolean isCheckedOut;

    private Room room;

    private Client client;

    private Employee employee;

}
