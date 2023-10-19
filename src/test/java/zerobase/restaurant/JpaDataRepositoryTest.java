package zerobase.restaurant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.restaurant.domain.Data;
import zerobase.restaurant.repository.JpaDataRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class JpaDataRepositoryTest {

    @Autowired
    JpaDataRepository jpaDataRepository;

    @Test
    void insertDataTest() {
        //given
        Data newData = new Data(10, "this is Jpa data");

        //when
        jpaDataRepository.save(newData);

        //then
        List<Data> dataList = jpaDataRepository.findAll();
        assertTrue(dataList.size() > 0);

    }

}
