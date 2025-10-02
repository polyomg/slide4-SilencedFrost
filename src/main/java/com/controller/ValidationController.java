package com.controller;

import com.entity.StudentValidation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class ValidationController {
    @RequestMapping("/student/formvalidation")
    public String showForm(Model model, @ModelAttribute("student") StudentValidation student) {
        model.addAttribute("message", "Vui lòng nhập thông tin sinh viên!");
        return "/demo/studentvalidation";
    }
    @RequestMapping("/student/savevalidation")
    public String validateForm(
            @Valid @ModelAttribute("student") StudentValidation student,
            Errors errors,
            Model model) {

        if(errors.hasErrors()) {
            model.addAttribute("message", "Vui lòng sửa các lỗi sau!");
        } else {
            model.addAttribute("message", "Dữ liệu đã nhập đúng!");
        }

        return "/demo/studentvalidation";
    }

}
