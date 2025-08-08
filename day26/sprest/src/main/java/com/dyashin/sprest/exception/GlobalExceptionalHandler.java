package com.dyashin.sprest.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionalHandler {

    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(Model model, NullPointerException ex) {
        model.addAttribute("errorMessage", "Null Pointer occurred: " + ex.getMessage());
        return "errorPage";
    }

    @ExceptionHandler(Exception.class)
    public String handleGenericException(Model model, Exception ex) {
        model.addAttribute("errorMessage", "An error occurred: " + ex.getMessage());
        return "errorPage";
    }
}
