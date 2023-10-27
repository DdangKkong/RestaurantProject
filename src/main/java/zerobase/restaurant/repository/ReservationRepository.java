package zerobase.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.restaurant.entitydomain.Reservation;
import zerobase.restaurant.entitydomain.Restaurant;
import zerobase.restaurant.entitydomain.User;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByUserId(User user);

    List<Reservation> findByRestaurant(Restaurant restaurant);

}
