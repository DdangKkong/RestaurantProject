package zerobase.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import zerobase.restaurant.entitydomain.MemberEntity;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
                                                        //<Entity, Entity의 id타입>

    Optional<MemberEntity> findByUsername(String username);

    boolean existsByUsername(String username);



}
