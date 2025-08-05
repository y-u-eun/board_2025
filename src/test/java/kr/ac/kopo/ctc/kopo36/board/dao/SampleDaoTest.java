package kr.ac.kopo.ctc.kopo36.board.dao;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import kr.ac.kopo.ctc.kopo36.board.repository.SampleSpecs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class SampleDaoTest {

    @Autowired
    SampleDao sampleDao;

    @Test
    void findAll() {
        List<Sample> sampleList = sampleDao.findAll();
        for (Sample s : sampleList) {
            System.out.println(s.getTitle());
        }
    }

    @Test
    void findById() {
        Long id = 3L;
        Sample sample = sampleDao.findById(id);

        System.out.println(sample.toString());
    }
}
