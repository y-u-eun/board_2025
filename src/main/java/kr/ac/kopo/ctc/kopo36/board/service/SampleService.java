package kr.ac.kopo.ctc.kopo36.board.service;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface SampleService {
    void testNoTransactional();
    void testTransactional();

    String testNoCache(Long id);
    String testCache(Long id);
    void testCacheClear(Long id);

    int add(int i, int j);

    Optional<Sample> selectOne(Long id);
}
