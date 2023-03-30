package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.models.UserModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RegisterDaoImp implements RegisterDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<RegisterModel> getAll(){
        String hql = "FROM RegisterModel as u";
        return (List<RegisterModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public RegisterModel get( long id){
        return entityManager.find(RegisterModel.class, id);

    }
    @Transactional
    @Override
    public RegisterModel register( RegisterModel registerModel){
        entityManager.merge(registerModel);
        return registerModel;
    }
    @Transactional
    @Override
    public RegisterModel update( RegisterModel registerModel){
        entityManager.merge(registerModel);
        return registerModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        RegisterModel registerModel = get(id);
        entityManager.remove(registerModel);
    }
}
