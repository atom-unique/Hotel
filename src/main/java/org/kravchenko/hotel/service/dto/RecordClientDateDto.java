package org.kravchenko.hotel.service.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class RecordClientDateDto {

    private ClientNoServicesDto client;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

}
