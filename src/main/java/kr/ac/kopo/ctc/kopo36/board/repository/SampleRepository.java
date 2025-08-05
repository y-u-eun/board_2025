package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.print.attribute.standard.PageRanges;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface SampleRepository extends JpaRepository<Sample, Long>, JpaSpecificationExecutor<Sample> {
//    Optional<Sample> findOneByTitle(String title);
//    Page<Sample> findAllByTitle(String type, Pageable pageable);
//    List<Sample> findAllByTitle(String type);

//     List<Sample> findByTitle(String title);
    List<Sample> findByTitleLike(String title);

    // Spring Data JPA - JPA Query Methods
}
