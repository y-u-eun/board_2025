package kr.ac.kopo.ctc.kopo36.board.service;

import kr.ac.kopo.ctc.kopo36.board.aop.LoggingAspect;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(LoggingAspect.class)
@SpringBootTest
public class SampleServiceTest {

    @Autowired
    SampleService sampleService;

    @Test
    void testNoCache1() {
        System.out.println("testNoCache1 Start");
        String ret = sampleService.testNoCache(3L);
        System.out.println("testNoCache1 End, " + ret);
    }

    @Test
    void testNoCache2() {
        System.out.println("testNoCache2 Start");
        String ret = sampleService.testNoCache(3L);
        System.out.println("testNoCache2 End, " + ret);
    }

    @Test
    void testCache1() {
        System.out.println("testCache1 Start");
        String ret = sampleService.testCache(3L);
        System.out.println("testCache1 End, " + ret);
    }

    @Test
    void testCache2() {
        System.out.println("testCache2 Start");
        String ret = sampleService.testCache(3L);
        System.out.println("testCache2 End, " + ret);
    }
}
