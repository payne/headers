package demo.headers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Enumeration;


@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/headers")
    @ResponseBody
    public String headers(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        String headerInfo = "<pre>\n";
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            headerInfo += headerName + ": " + request.getHeader(headerName) + "\n";
        }
        headerInfo += "</pre>";
        return headerInfo;
    }
}
