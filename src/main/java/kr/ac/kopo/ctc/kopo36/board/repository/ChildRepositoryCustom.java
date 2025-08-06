package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Child;

import java.util.List;

public interface ChildRepositoryCustom {
    List<Child> selectAll();
}
