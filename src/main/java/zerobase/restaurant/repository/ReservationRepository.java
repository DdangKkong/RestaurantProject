package zerobase.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.restaurant.entitydomain.ReservationEntity;
import zerobase.restaurant.entitydomain.RestaurantEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

    Optional<ReservationEntity> findById(Long id);

    List<ReservationEntity> findByRestaurantEntity(RestaurantEntity restaurantEntity);

}
