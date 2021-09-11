package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    /**정적 컨텐츠**/
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("dataHello", "hello, World!");
        return "hello";
//        컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버( viewResolver )가 화면을 찾아서 처리한다.
//        스프링 부트 템플릿엔진 기본 viewName 매핑
//        resources:templates/ +{ViewName}+ .html
    }
    /**mvc와 템플릿 엔젠**/
    @GetMapping("hello-MVC")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
    
    //위와 다르게 html 없이 문자가 그대로 들어감
    @GetMapping("hello-string")
    //@ResponseBody 가 안 붙어있으면 viewResolver 로 바로 html 로 바로 보내버리는데 붙어있으면 + 객체가 오면 json으로 만들어서 반환하겠다(정책)
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello "+ name;
    }

    /**api(string 과 json )**/
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;

    }

    static class Hello {
        private String name;

        //GETTER SETTER 단축키 : ALT + INSERT
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
