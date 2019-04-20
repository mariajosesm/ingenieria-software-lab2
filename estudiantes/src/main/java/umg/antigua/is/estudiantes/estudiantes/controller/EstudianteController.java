/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.estudiantes.estudiantes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.antigua.is.estudiantes.estudiantes.model.Estudiante;
import umg.antigua.is.estudiantes.estudiantes.services.servicioEstudiante;

/**
 *
 * @author mariajose
 */
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private servicioEstudiante estudianteservice;
    
    @GetMapping("/buscarTodos")
    public List<Estudiante> seleccionartodo(){
        return this.estudianteservice.buscarTodos();
    }
    
    @PostMapping("/registrar")
    public Estudiante insertar(@RequestBody(required = true) Estudiante e1){
        return this.estudianteservice.registrar(e1);
    }
    
}
