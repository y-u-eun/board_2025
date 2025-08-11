package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
