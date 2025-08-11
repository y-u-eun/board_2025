package kr.ac.kopo.ctc.kopo36.board.controller;

import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import kr.ac.kopo.ctc.kopo36.board.repository.PostRepository;
import kr.ac.kopo.ctc.kopo36.board.repository.SampleRepository;
import kr.ac.kopo.ctc.kopo36.board.service.SampleService;
import kr.ac.kopo.ctc.kopo36.board.web.SampleController;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class SampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private PostRepository postRepository;

    @MockitoBean
    private SampleRepository sampleRepository;

    @MockitoBean
    private SampleService sampleService;

    @Test
    void testGetSample() throws Exception {
        Sample sample = new Sample(1L, "title1");
        Mockito.when(sampleService.selectOne(1L)).thenReturn(Optional.of(sample));

        mockMvc.perform(get("/sample/selectOne").param("id", "1")).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("title1")).andDo(print());
    }
}
