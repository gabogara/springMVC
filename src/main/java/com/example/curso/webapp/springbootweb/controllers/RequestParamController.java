package com.example.curso.webapp.springbootweb.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.example.curso.webapp.springbootweb.models.User;
import com.example.curso.webapp.springbootweb.models.dto.ParamDto;
import com.example.curso.webapp.springbootweb.models.dto.UserDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/params")
public class RequestParamController {

@GetMapping("/foo")
public ParamDto foo(@RequestParam(required=false, defaultValue = "Default message") String message){
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
}

@GetMapping("/search")
public ParamDto getMethodName(
    @RequestParam(required = false) String message, 
    @RequestParam(required = false) Integer code ) {
    ParamDto paramDto = new ParamDto();
    paramDto.setMessage(message);
    paramDto.setCode(code);
    return paramDto;
}

@GetMapping("/request")
public ParamDto request(HttpServletRequest request){
    ParamDto paramDto = new ParamDto();
    paramDto.setMessage(request.getParameter("message"));
    String code = request.getParameter("code");
    paramDto.setCode(code != null ? Integer.parseInt(code) : null);
    return paramDto;
}

}
