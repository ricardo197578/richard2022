package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Educacion;
import com.porfolio.richard.Repository.EducacionRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;


@Service
@Transactional
public class EducacionService {
	
	private final EducacionRepository educacionRepository;

	@Autowired
    EducacionRepository EducacionRepository;

    public List<Educacion> obtenerTodos(){
        List<Educacion> lista = educacionRepository.findAll();
        return lista;
    }

    public Optional<Educacion> obtenerPorId(Long id){
        return educacionRepository.findById(id);
    }

    public Optional<Educacion> obtenerPorNombre(String np){
        return educacionRepository.findByNombreEducacion(np);
    }

    public void guardar(Educacion educacion){
        educacionRepository.save(educacion);
    }
	public void borrar(Long id){
        educacionRepository.deleteById(id);
    }

    public boolean existePorNombre(String np){
        return educacionRepository.existsByNombreEducacion(np);
    }

    public boolean existePorId(Long id){
        return educacionRepository.existsById(id);

        }


}
