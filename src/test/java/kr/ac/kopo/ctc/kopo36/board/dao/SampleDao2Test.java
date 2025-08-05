package kr.ac.kopo.ctc.kopo36.board.dao;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleDao2Test {

    @Autowired
    SampleDao2 sampleDao2;

    @Test
    void findAll() {
        List<Sample> sampleList = sampleDao2.findAll();
        assertEquals(10, sampleList.size());
    }

    @Test
    void findById() {
        Long id = 3L;
        Sample sample = sampleDao2.findById(id);
        assertEquals(id, sample.getId());
    }
}
