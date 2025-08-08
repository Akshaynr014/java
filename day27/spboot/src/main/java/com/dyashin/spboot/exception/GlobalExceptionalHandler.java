//package com.dyashin.spboot.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//public class GlobalExceptionalHandler {
//
//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<Map<String, Object>> handleNullPointerException(NullPointerException ex) {
//        Map<String, Object> body = new HashMap<>();
//        body.put("error", "Null Pointer occurred");
//        body.put("message", ex.getMessage());
//        body.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
//        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
//        Map<String, Object> body = new HashMap<>();
//        body.put("error", "An error occurred");
//        body.put("message", ex.getMessage());
//        body.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
//        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
