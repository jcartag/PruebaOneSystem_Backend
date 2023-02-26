package com.example.apirest_prueba.controladores;


import com.example.apirest_prueba.modelos.Alumno;
import com.example.apirest_prueba.servicios.AlumnoServicioImplem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class AlumnoControler {

    @Autowired
    AlumnoServicioImplem alumnoServicioImplem;

    @GetMapping("/alumno")
    public List<Alumno> obtenerAlumno(){
        return alumnoServicioImplem.getAll();
    }

    @PostMapping("/guardarAlumno")
    public ResponseEntity<Alumno> guardarAlumno(@RequestBody Alumno alumno){
        Alumno nuevo_alumno = alumnoServicioImplem.save(alumno);
        return new ResponseEntity<>(nuevo_alumno, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/alumno/{id}")
    public ResponseEntity<Alumno> obtenerAlumnoId(@PathVariable long idAlumno){
        Alumno alumnoPorId = alumnoServicioImplem.getById(idAlumno);

        return ResponseEntity.ok(alumnoPorId);
    }

    @PutMapping("/alumno/{id}")
    public ResponseEntity<Alumno> actualizar(@PathVariable long idAlumno, @RequestBody Alumno alumno){

        Alumno alumnoPorId = alumnoServicioImplem.getById(idAlumno);
        alumnoPorId.setNombre_completo(alumno.getNombre_completo());
        alumnoPorId.setIdentificacion(alumno.getIdentificacion());
        alumnoPorId.setNumero_telefono((int) alumno.getNumero_telefono());
        alumnoPorId.setEmail(alumno.getEmail());
        alumnoPorId.setDireccion_residencia(alumno.getDireccion_residencia());
        alumnoPorId.setGenero(alumno.getGenero());
        alumnoPorId.setNumero_matricula(alumno.getNumero_matricula());
        alumnoPorId.setPrograma(alumno.getPrograma());
        alumnoPorId.setNota_promedio(alumno.getNota_promedio());

        Alumno alumno_actualizado = alumnoServicioImplem.save(alumnoPorId);
        return  new ResponseEntity<>(alumno_actualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/alumno/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarAlumno(@PathVariable long idAlumno){
        this.alumnoServicioImplem.delete(idAlumno);

        HashMap<String, Boolean> estadoAlumnoEliminado = new HashMap<>();
        estadoAlumnoEliminado.put("Eliminado", true);
        return ResponseEntity.ok(estadoAlumnoEliminado);
    }
}
