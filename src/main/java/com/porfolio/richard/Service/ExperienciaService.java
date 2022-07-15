package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Producto;
import com.porfolio.richard.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public List<Experiencia> obtenerTodos(){
        List<Experiencia> lista = experienciaRepository.findAll();
        return lista;
    }
public Optional<Experiencia> obtenerPorId(Long id){
        return experienciaRepository.findById(id);
    }

    public Optional<Experiencia> obtenerPorNombre(String np){
        return experienciaRepository.findByNombreExperiencia(np);
    }

    public void guardar(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }

    public void borrar(Long id){
        experienciaRepository.deleteById(id);
    }

    public boolean existePorNombre(String np){
        return experienciaRepository.existsByNombreExperiencia(np);
    }

    public boolean existePorId(Long id){
        return experienciaRepository.existsById(id);

}

}

