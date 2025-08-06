package kr.ac.kopo.ctc.kopo36.board.repository;

import kr.ac.kopo.ctc.kopo36.board.domain.Child;
import kr.ac.kopo.ctc.kopo36.board.domain.Parent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ChildRepositoryTest {

    @Autowired
    ChildRepository childRepository;


    @Autowired
    ParentRepository parentRepository;

//    @Test
//    public void beforeEach() {
//        for (int i = 1; i <= 5; i++) {
//            Parent parent = new Parent();
//            parent.setName("parent" + i);
//            parentRepository.save(parent);
//
//            Child child = new Child();
//            child.setName("child" + i);
//            child.setParent(parent);
//            childRepository.save(child);
//        }
//    }

    @Test
    void findAll() {
        List<Child> children = childRepository.findAll();
        for (Child i : children) {
            i.getParent().getName();
        }
    }

    @Test
    void fetchAll() {
        List<Child> children2 = childRepository.fetchAll();
        for (Child c : children2) {
            c.getParent().getName();
        }
    }

    @Test
    void selectAll() {
        List<Child> children3 = childRepository.selectAll();
        for (Child c : children3) {
            c.getParent().getName();
        }
    }

}


