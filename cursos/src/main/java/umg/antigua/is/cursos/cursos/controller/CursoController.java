/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.cursos.cursos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.antigua.is.cursos.cursos.model.Curso;
import umg.antigua.is.cursos.cursos.services.servicioCurso;

/**
 *
 * @author mariajose
 */
@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private servicioCurso cursoservice;
    
    @GetMapping("/buscarTodos")
    public List<Curso> seleccionartodo(){
        return this.cursoservice.buscarTodos();
    }
    
    @PostMapping("/crear")
    public Curso insertar(@RequestBody(required = true) Curso e1){
        return this.cursoservice.crear(e1);
    }
    
}
