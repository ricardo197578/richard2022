package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Skills;                                  import com.porfolio.richard.Repository.SkillsRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillsService {

        @Autowired
        SkillsRepository skillsRepository;

	public List<Skills> obtenerTodos(){
        List<Skills> lista = skillsRepository.findAll();
        return lista;
    }

    public Optional<Skills> obtenerPorId(Long id){
        return skillsRepository.findById(id);
    }

    public Optional<Skills> obtenerPorNombre(String np){
        return skillsRepository.findByNombreProducto(np);
    }

    public void guardar(Skills skills){
        skillsRepository.save(producto);
    }

    public void borrar(Long id){
        skillsRepository.deleteById(id);
    }

    public boolean existePorNombre(String np){
	return skillsRepository.existsByNombreProducto(np);
    }

    public boolean existePorId(Long id){
        return skillsRepository.existsById(id);

        }

             

     
}

