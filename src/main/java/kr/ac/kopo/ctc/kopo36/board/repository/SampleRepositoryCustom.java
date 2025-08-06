package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;

import java.util.List;

public interface SampleRepositoryCustom {

    List<Sample> findAllByDynamicConditions(String title);

    Long countByTitleContaining(String title);
}
