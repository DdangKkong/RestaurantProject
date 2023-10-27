package zerobase.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.restaurant.entitydomain.Data;

@Repository
public interface JpaDataRepository extends JpaRepository<Data, Integer> {
                                                        //<Entity, Entity의 id타입>

}
