package org.kravchenko.hotel.controller.impl;

import lombok.RequiredArgsConstructor;
import org.kravchenko.hotel.controller.RecordController;
import org.kravchenko.hotel.service.RecordService;
import org.kravchenko.hotel.service.dto.RecordClientDateDto;
import org.kravchenko.hotel.service.dto.RecordClientWithRoomDto;
import org.kravchenko.hotel.service.dto.RoomNoClientsDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RecordControllerImpl implements RecordController {

    private final RecordService recordService;

    @Override
    public void checkIn(
            Long clientId,
            Long employeeId,
            Long roomId,
            String checkOutDate,
            List<Long> services
    ) {
        recordService.checkIn(clientId, employeeId, roomId, checkOutDate, services);
    }

    @Override
    public void checkOut(String name, String surname) {
        recordService.checkOut(name, surname);
    }

    @Override
    public int getAllFreeRoomsCount() {
        return recordService.clientsCount();
    }

    @Override
    public List<RecordClientWithRoomDto> getClientsWithRooms() {
        return recordService.getClientsWithRooms();
    }

    @Override
    public List<RecordClientWithRoomDto> getClientsWithRoomsByCheckOut() {
        return recordService.getClientsWithRoomsByCheckOut();
    }

    @Override
    public int getTotalForRoom(Long id) {
        return recordService.getTotalForRoom(id);
    }

    @Override
    public List<RecordClientDateDto> getLastRoomClients(Long roomId) {
        return recordService.getLastRoomClients(roomId);
    }

    @Override
    public List<RoomNoClientsDto> getAllFreeRoomsByDate(String dateLine) {
        return recordService.getAllFreeRoomsByDate(dateLine);
    }

}
