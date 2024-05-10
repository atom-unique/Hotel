package org.kravchenko.hotel.controller.impl;

import lombok.RequiredArgsConstructor;
import org.kravchenko.hotel.controller.RoomController;
import org.kravchenko.hotel.service.RoomService;
import org.kravchenko.hotel.service.dto.RoomDto;
import org.kravchenko.hotel.service.dto.RoomPriceDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomControllerImpl implements RoomController {

    private final RoomService roomService;

    @Override
    public RoomDto getRoom(Long id) {
        return roomService.findRoom(id);
    }

    @Override
    public List<RoomPriceDto> getAllRoomsWithPrice() {
        return roomService.getAllRoomsWithPrice();
    }

    @Override
    public List<RoomDto> findAllRoomsSortedByPrice() {
        return roomService.findAllRoomsSortedByPrice();
    }

    @Override
    public List<RoomDto> findAllRoomsSortedByCapacity() {
        return roomService.findAllRoomsSortedByCapacity();
    }

    @Override
    public List<RoomDto> findAllRoomsSortedByRating() {
        return roomService.findAllRoomsSortedByRating();
    }

    @Override
    public List<RoomDto> findAllFreeRoomsSortedByPrice() {
        return roomService.findAllFreeRoomsSortedByPrice();
    }

    @Override
    public List<RoomDto> findAllFreeRoomsSortedByCapacity() {
        return roomService.findAllFreeRoomsSortedByCapacity();
    }

    @Override
    public List<RoomDto> findAllFreeRoomsSortedByRating() {
        return roomService.findAllFreeRoomsSortedByRating();
    }

    @Override
    public void saveRoom(RoomDto roomDto) {
        roomService.addRoom(roomDto);
    }

    @Override
    public void roomPriceUpdate(Long id, int price) {
        roomService.roomPriceUpdate(id, price);
    }

    @Override
    public void roomStatusUpdate(Long id, boolean inService) {
        roomService.roomStatusUpdate(id, inService);
    }

    @Override
    public int getAllFreeRoomsCount() {
        return roomService.getAllFreeRoomsCount();
    }

}
