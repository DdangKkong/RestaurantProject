package zerobase.restaurant.dto;

import lombok.*;
import zerobase.restaurant.entitydomain.Reservation;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDto {

    private String restaurantName;

    private LocalDateTime reservationWhen; // 예약 일시

    private String userName;

    private Integer userNum; // 예약 인원수

    public static ReservationDto fromEntity(Reservation reservation){
        return ReservationDto.builder()
                .restaurantName(reservation.getRestaurant().getRestaurantName())
                .reservationWhen(reservation.getReservationWhen())
                .userName(reservation.getUser().getUserName())
                .userNum(reservation.getUserNum())
                .build();
    }

}
