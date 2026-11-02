package com.example.curso.webapp.springbootweb.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.example.curso.webapp.springbootweb.models.User;
import com.example.curso.webapp.springbootweb.models.dto.ParamDto;
import com.example.curso.webapp.springbootweb.models.dto.UserDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
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
    String strCode = request.getParameter("code");
    String message = request.getParameter("message");
    
    int code = 0;
    if( strCode != null){
        try{
            code= Integer.parseInt(strCode);
        }catch(NumberFormatException e){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "The parameter 'code' must be a number", e
            );
        }
    }
    ParamDto paramDto = new ParamDto();
    paramDto.setMessage(message);
    paramDto.setCode(code);
    
    return paramDto;
}

}
