package com.porfolio.richard.Controller;

import com.porfolio.richard.DTO.Mensaje;
import com.porfolio.richard.Entity.Skills;
import com.porfolio.richard.Service.SkillsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins= {"*"})

public class SkillsController {

    @Autowired
    SkillsService skillsService;

@GetMapping("/lista")
    public ResponseEntity<List<Skills>> getLista(){
        List<Skills> lista = skillsService.obtenerTodos();
        return new ResponseEntity<List<Skills>>(lista, HttpStatus.OK);
    }
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Skills> getOne(@PathVariable Long id){
        Skills skills = skillsService.obtenerPorId(id).get();
        return new ResponseEntity<Skills>(skills, HttpStatus.OK);
    }



    @PostMapping("nuevo")
    public ResponseEntity<?> create(@RequestBody  Skills skills){

        return skillsService.guardar(skills);

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@RequestBody Skills skills, @PathVariable("id") Long id){
        Skills skillsUpdate = skillsService.obtenerPorId(id).get();

        skillsUpdate.setNombreEdu(educacion.getNombre());
        skillsUpdate.setFoto(educacion.getFoto());
        skillsUpdate.setPorcentaje(educacion.getPorcentaje());
           
        return skillsService.guardar(skillsUpdate);

    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
             skillsService.borrar(id);

    }
}


