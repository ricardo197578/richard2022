package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Rol;
import com.porfolio.richard.enums.RolNombre;
import com.porfolio.richard.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
	rolRepository.save(rol);
    }
}
