package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.dao.UserDao;
import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@CrossOrigin
public class RegisterService {
    @Autowired
    RegisterDao registerDao;

    public List<RegisterModel> getAll(){
        return registerDao.getAll();
    }

    public RegisterModel get( long id){

        return registerDao.get(id);
    }

    public RegisterModel register( RegisterModel registerModel){
        return registerDao.register(registerModel);
    }

    public RegisterModel update(@RequestBody RegisterModel registerModel){
        return registerDao.update(registerModel);
    }

    public void delete(@PathVariable long id){
        registerDao.delete(id);
    }
}
