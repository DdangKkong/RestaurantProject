package zerobase.restaurant.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import zerobase.restaurant.entitydomain.ReservationEntity;
import zerobase.restaurant.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // 매장 테이블 예약
    @PostMapping("/{userId}")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> addReservation(
//            @PathVariable Long userId,
            @RequestBody ReservationEntity reservationEntity) {

        return ResponseEntity.ok(reservationService.addReservation(reservationEntity));

    }

    // 매장 테이블 예약 취소


}
