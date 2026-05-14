package src.main.java.com.LearningWebsite.main.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {
    public void getMainPage(HttpServletRequest request, HttpServletResponse response) {
        // Logic to handle the main page request
        // For example, you can return a view or a JSON response
        Map<String, Object> model = new HashMap<>();
        model.put("message", "Welcome to the Learning Website!");
        // Return the view name or JSON response
    }
}
