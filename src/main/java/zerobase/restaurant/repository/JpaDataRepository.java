package zerobase.restaurant.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.restaurant.domain.Data;

import javax.sql.DataSource;

@Repository
public interface JpaDataRepository extends JpaRepository<Data, Integer> {
                                                        //<Entity, Entity의 id타입>

}
