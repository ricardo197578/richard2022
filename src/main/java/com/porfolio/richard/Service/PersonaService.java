package com.porfolio.richard.Service;
import com.porfolio.richard.Entity.Persona;

import com.porfolio.richard.Entity.Educacion;
import com.porfolio.richard.Repository.PersonaRepository;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class PersonaService {
	
	private final PersonaRepository personaRepository;

	@Autowired
	public PersonaService(PersonaRepository personaRepository){
	this.personaRepository = personaRepository;
	}

	public Persona addPersona(Persona persona){
		return personaRepository.save(persona);
	}
	public List<Persona>buscarPersona(){
		return personaRepository.findAll();
	}
	public Persona editarPersona(Persona persona){
		return personaRepository.save(persona);
	}
	public void borrarPersona(Long id){
		personaRepository.deleteById(id);
	}
	public Persona buscarPersonaPorId(Long id){
		return personaRepository.findById(id).orElse(null);
	}

}

/*
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> obtenerTodos(){
        List<Producto> lista = productoRepository.findAll();
        return lista;
    }

    public Optional<Producto> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

    public Optional<Producto> obtenerPorNombre(String np){
        return productoRepository.findByNombreProducto(np);
    }

    public void guardar(Producto producto){
        productoRepository.save(producto);
    }

    public void borrar(Long id){
        productoRepository.deleteById(id);
    }

    public boolean existePorNombre(String np){
        return productoRepository.existsByNombreProducto(np);
    }

    public boolean existePorId(Long id){
        return productoRepository.existsById(id)*/
