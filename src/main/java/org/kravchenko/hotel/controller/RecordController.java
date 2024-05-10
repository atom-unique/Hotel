package org.kravchenko.hotel.controller;

import org.kravchenko.hotel.service.dto.RecordClientDateDto;
import org.kravchenko.hotel.service.dto.RecordClientWithRoomDto;
import org.kravchenko.hotel.service.dto.RoomNoClientsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("api/hotel/records")
public interface RecordController {

    @PutMapping("/checkin")
    void checkIn(
            @RequestParam Long clientId,
            @RequestParam Long employeeId,
            @RequestParam Long roomId,
            @RequestParam String checkOutDate,
            @RequestBody List<Long> services
    );

    @PostMapping("/checkout")
    void checkOut(@RequestParam String name, @RequestParam String surname);

    @GetMapping("/clients/count")
    int getAllFreeRoomsCount();

    @GetMapping("/clients/list")
    List<RecordClientWithRoomDto> getClientsWithRooms();

    @GetMapping("/clients/list/date")
    List<RecordClientWithRoomDto> getClientsWithRoomsByCheckOut();

    @GetMapping("/room/total")
    int getTotalForRoom(@RequestParam Long id);

    @GetMapping("/room/clients/last")
    List<RecordClientDateDto> getLastRoomClients(@RequestParam Long roomId);

    @GetMapping("/rooms/free/by")
    List<RoomNoClientsDto> getAllFreeRoomsByDate(@RequestParam String dateLine);

}
