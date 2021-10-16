package music.musicspring.test;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    TestService service;

    @RequestMapping("/content")
    public List<Map<String, String>> test() {
        return service.test();
    }

    @PostMapping("/example")
    public List<Map<String, String>> example(@RequestParam Map<String, String> param) {
        System.out.println(param);
        return service.test();
    }


}