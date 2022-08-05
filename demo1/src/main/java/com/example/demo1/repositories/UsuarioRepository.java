package com.example.demo1.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long>{
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad); 

}
