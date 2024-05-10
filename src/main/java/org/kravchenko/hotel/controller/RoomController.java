package org.kravchenko.hotel.controller;

import org.kravchenko.hotel.service.dto.RoomDto;
import org.kravchenko.hotel.service.dto.RoomPriceDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("api/hotel/rooms")
public interface RoomController {

    @GetMapping("/room")
    RoomDto getRoom(@RequestParam Long id);

    @GetMapping("/all/price")
    List<RoomPriceDto> getAllRoomsWithPrice();

    @GetMapping("/price")
    List<RoomDto> findAllRoomsSortedByPrice();

    @GetMapping("/capacity")
    List<RoomDto> findAllRoomsSortedByCapacity();

    @GetMapping("/rating")
    List<RoomDto> findAllRoomsSortedByRating();

    @GetMapping("/free/price")
    List<RoomDto> findAllFreeRoomsSortedByPrice();

    @GetMapping("/free/capacity")
    List<RoomDto> findAllFreeRoomsSortedByCapacity();

    @GetMapping("/free/rating")
    List<RoomDto> findAllFreeRoomsSortedByRating();

    @PutMapping("/new")
    void saveRoom(@RequestBody RoomDto roomDto);

    @PostMapping("/update/price")
    void roomPriceUpdate(@RequestParam Long id, @RequestParam int price);

    @PostMapping("/update/status")
    void roomStatusUpdate(@RequestParam Long id, @RequestParam boolean inService);

    @GetMapping("/free/count")
    int getAllFreeRoomsCount();

}
