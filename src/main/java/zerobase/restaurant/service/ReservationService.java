package zerobase.restaurant.service;

import org.springframework.stereotype.Service;
import zerobase.restaurant.dto.ReservationDto;
import zerobase.restaurant.entitydomain.ReservationEntity;
import zerobase.restaurant.repository.ReservationRepository;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // 예약 등록
    public ReservationDto addReservation(ReservationEntity reservationEntity){
        return ReservationDto.fromEntity(reservationRepository.save(
                ReservationEntity.builder()
                        .memberEntity(reservationEntity.getMemberEntity())
                        .restaurantEntity(reservationEntity.getRestaurantEntity())
                        .reservationWhen(reservationEntity.getReservationWhen())
                        .userNum(reservationEntity.getUserNum())
                        .build()
        ));
    }

}
