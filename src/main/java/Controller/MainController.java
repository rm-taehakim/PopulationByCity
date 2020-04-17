package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {

    @RequestMapping("/main")
    public String main(Model model, HttpServletRequest request) {
        model.addAttribute("pageName", "../main.jsp");
        return "main";
    }
}
