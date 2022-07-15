ackage com.porfolio.richard.Controller;

import com.porfolio.richard.DTO.Mensaje;
import com.porfolio.richard.Entity.Experiencia;
import com.porfolio.richard.Service.ExperienciaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin(origins= {"*"})

public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;
@GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> getLista(){
        List<Experiencia> lista = experienciaService.obtenerTodos();
        return new ResponseEntity<List<Experiencia>>(lista, HttpStatus.OK);
    }
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Experiencia> getOne(@PathVariable Long id){
        Experiencia experiencia = experienciaService.obtenerPorId(id).get();
        return new ResponseEntity<Experiencia>(experiencia, HttpStatus.OK);
    }



    @PostMapping("nuevo")
    public ResponseEntity<?> create(@RequestBody  Experiencia experiencia){

        return experienciaService.guardar(experiencia);

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@RequestBody Experiencia experiencia, @PathVariable("id") Long id){
	Experiencia experienciaUpdate = experienciaService.obtenerPorId(id).get();

        experienciaUpdate.setTituloExp(experiencia.getTituloExp());
        experienciaUpdate.Descexp(experiencia.getDescExp());
        experienciaUpdate.setImagenExp(experiencia.getImagenExp());

        return experienciaService.guardar(experienciaUpdate);
		
    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
             experienciaService.borrar(id);

    }
}

