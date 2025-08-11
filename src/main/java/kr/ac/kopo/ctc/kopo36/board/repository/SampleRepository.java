package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long>, JpaSpecificationExecutor<Sample>, SampleRepositoryCustom {
//    Optional<Sample> findOneByTitle(String title);
//    Page<Sample> findAllByTitle(String type, Pageable pageable);
//    List<Sample> findAllByTitle(String type);
//     List<Sample> findByTitle(String title);
    Optional<Sample> findById(Long id);
    List<Sample> findAllByTitleContaining(String title);
    List<Sample> findByTitleLike(String title);
    @Query("SELECT s FROM Sample s WHERE s.title LIKE %:title%")
    List<Sample> findAllByTitleLike(@Param("title") String title);
    // Spring Data JPA - JPA Query Methods
}
