package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.RegisterService;
import com.basedatos.basededatos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RegisterController {
    @Autowired
    RegisterService registerService;

    @GetMapping("/getAll")
    List<RegisterModel> getAllUser(){
        return registerService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    RegisterModel getUserById(@PathVariable("id") long id ){
        return registerService.get(id);
    }

    @PostMapping(value = "/create")
    RegisterModel createUser(@RequestBody RegisterModel registerModel){
        return registerService.register(registerModel);
    }



    @PutMapping(value = "/update/{id}")
    RegisterModel updateUserById(@RequestBody RegisterModel registerModel ){
        return registerService.update(registerModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        registerService.delete(id);
    }
}
