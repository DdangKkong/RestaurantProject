package zerobase.restaurant.dto;

import lombok.*;
import zerobase.restaurant.entitydomain.ReservationEntity;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDto {

    private String restaurantName;

    private LocalDateTime reservationWhen; // 예약 일시

    private String userId;

    private String userName;

    private Integer userNum; // 예약 인원수

    public static ReservationDto fromEntity(ReservationEntity reservationEntity){
        return ReservationDto.builder()
                .restaurantName(reservationEntity.getRestaurantEntity().getRestaurantName())
                .reservationWhen(reservationEntity.getReservationWhen())
                .userId(reservationEntity.getMemberEntity().getMemberId())
                .userName(reservationEntity.getMemberEntity().getUsername())
                .userNum(reservationEntity.getUserNum())
                .build();
    }

}
