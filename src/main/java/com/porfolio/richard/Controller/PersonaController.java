package com.porfolio.richard.Controller;

import com.porfolio.richard.Entity.Persona;
import com.porfolio.richard.Service.PersonaService;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/porfolio")
@CrossOrigin(origins= {"*"})

public class PersonaController{
	private final PersonaService personaService;
	
	/*consructor*/
	public PersonaController(PersonaService personaService){
		this.personaService = personaService;
	}

	/*get mapping para que en la direccion indicada nos traiga el usuario*/
	@GetMapping("/id/{id}")
	public ResponseEntity<Persona>obtenerPersona(@PathVariable("id")Long id){
		Persona persona = personaService.buscarPersonaPorId(id);
		return new ResponseEntity<>(persona,HttpStatus.OK);
	}

	/*para editar uso put*/
	@PutMapping("/update")                           
	public ResponseEntity<Persona>editarPersona(@RequestBody Persona persona){
		Persona	updatePersona= personaService.editarPersona(persona);                
	return new ResponseEntity<>(updatePersona,HttpStatus.OK);              }

	
}
