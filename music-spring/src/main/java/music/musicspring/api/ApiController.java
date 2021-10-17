package music.musicspring.api;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/api")
public class ApiController {
    @RequestMapping("/callback")
    public String naver(HttpRequest request )
    {
        System.out.println(request.getURI());
        System.out.println(request.getHeaders());
        System.out.println(request.getMethodValue());
        System.out.println(request.getClass());
    //    System.out.println(param);
        return "index";
    }
}
