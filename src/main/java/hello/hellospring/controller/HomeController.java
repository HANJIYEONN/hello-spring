package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//localhost8080 요청이 오면 먼저 스프링 컨테이너를 확인하여 관련 컨트롤러가 있는지 확인하고, 없으면  static을 확인
//참고: 컨트롤러가 정적 파일보다 우선순위가 높다
    @GetMapping("/")
    public String home() {
        return "home";
    }

}
