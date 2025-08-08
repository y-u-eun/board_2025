package kr.ac.kopo.ctc.kopo36.board.web;

import jakarta.servlet.http.HttpServletRequest;
import kr.ac.kopo.ctc.kopo36.board.domain.Post;
import kr.ac.kopo.ctc.kopo36.board.domain.Sample;
import kr.ac.kopo.ctc.kopo36.board.repository.PostRepository;
import kr.ac.kopo.ctc.kopo36.board.repository.SampleRepository;
import kr.ac.kopo.ctc.kopo36.board.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private SampleRepository sampleRepository;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/list")
    @ResponseBody
    public List<Sample> list(Model model) {
        return sampleRepository.findAll();
    }

    @Autowired
    private SampleService sampleService;

    @GetMapping("/noTransactional")
    @ResponseBody
    public String noTransactional(Model model) {
        sampleService.testNoTransactional();
        return "noTransactional";
    }

    @GetMapping("/transactional")
    @ResponseBody
    public String transactional(Model model) {
        sampleService.testTransactional();
        return "transactional";
    }

    @GetMapping("/noCache")
    @ResponseBody
    public String nocache(Model model) {
        return sampleService.testNoCache(3L);
    }

    @GetMapping("/cache")
    @ResponseBody
    public String cache(Model model) {
        return sampleService.testCache(3L);
    }

    @GetMapping("/getParameter")
    public String getParameter(Model model, HttpServletRequest req) {
        String title = req.getParameter("title");
        model.addAttribute("title", title);
        return "sample";
    }

    @GetMapping("/requestParam")
    public String requestParam(Model model, @RequestParam String title) {
        model.addAttribute("title", title);
        return "sample";
    }

    @GetMapping("/pathVariable/{title}")
    public String pathVariable(Model model, @PathVariable String title) {
        model.addAttribute("title", title);
        return "sample";
    }

    @GetMapping("/modelAttribute")
    public String modelAttribute(Model model, @ModelAttribute Sample sample) {
        model.addAttribute("title", sample.getTitle());
        return "sample";
    }

    @PostMapping("/requestBody1")
    @ResponseBody
    public ResponseEntity<Sample> requestBody1(@RequestBody Map<String, Object> obj) {
        Sample sample = new Sample();
        sample.setId(1L);
        sample.setTitle((String)obj.get("title"));
        return ResponseEntity.ok(sample);
    }

    @PostMapping("/requestBody2")
    @ResponseBody
    public Sample requestBody2(@RequestBody Sample sample) {
        Sample s = new Sample();
        s.setId(1L);
        s.setTitle(sample.getTitle());
        return s;
    }

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        //int sum = postRepository.findAll()

        PageRequest pageable = PageRequest.of(0, 10);
        Page<Post> page = postRepository.findAll(pageable);

        List<String> myItems = new ArrayList<>();
        myItems.add("aaa");
        myItems.add("bbb");
        myItems.add("ccc");

        model.addAttribute("name", "홍길동");
//        model.addAttribute("sum", sum);
        model.addAttribute("myItems", myItems);

        model.addAttribute("posts", page.getContent());
        return "hello";
    }

    @GetMapping("/selectOne")
    @ResponseBody
    public Sample selectOne(Model model, @RequestParam Long id) {
        return sampleService.selectOne(id);
    }
}
