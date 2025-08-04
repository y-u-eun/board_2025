package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleRepositoryTest {

    @Autowired
    SampleRepository sampleRepository;

    @Test
    void findAll() {
        List<Sample> list = sampleRepository.findAll();
        assertEquals(2, list.size());
    }
}
