package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.print.attribute.standard.PageRanges;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleRepositoryTest {

    @Autowired
    SampleRepository sampleRepository;

//    @Test
//    void findAll() {
//        List<Sample> list = sampleRepository.findAll();
//        assertEquals(2, list.size());
//    }

//    @Test
//    void findAllByTitle() {
//        Map<String, Object> filter = new HashMap<>();
//        filter.put("title", "t1");
//
//        PageRequest pageable = PageRequest.of(0, 10);
//        Page<Sample> page = sampleRepository.findAll(SampleSpecs.search(filter), pageable);
//
//        for (Sample s : page) {
//            System.out.println(s.getTitle());
//        }
//    }
//
//    @Test
//    void findByTitleLike() {
//        List<Sample> list = sampleRepository.findByTitleLike("t2");
//
//        for (Sample s : list) {
//            System.out.println(s.getId());
//        }
//    }
//
//    @Test
//    void findAllByTitleLike() {
//        List<Sample> list = sampleRepository.findAllByTitleLike("2");
//
//        for (Sample s : list) {
//            System.out.println(s.getId());
//        }
//    }

    @Test
    void findAllByDynamicConditions() {
        List<Sample> list2 = sampleRepository.findAllByDynamicConditions("t2");
        assertEquals(5, list2.size());
    }

    @Test
    void countByTitleContaining() {
        Long resultant = sampleRepository.countByTitleContaining("t2");
        assertEquals(5, resultant);
    }
}
