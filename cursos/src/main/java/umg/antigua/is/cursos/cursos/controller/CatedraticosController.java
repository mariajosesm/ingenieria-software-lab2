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
import umg.antigua.is.cursos.cursos.model.Catedraticos;
import umg.antigua.is.cursos.cursos.services.servicioCatedraticos;

/**
 *
 * @author mariajose
 */
@RestController
@RequestMapping("/catedratico")
public class CatedraticosController {
    
    @Autowired
    private servicioCatedraticos catedraticosservice;
    
    @GetMapping("/buscarTodos")
    public List<Catedraticos> seleccionartodo(){
        return this.catedraticosservice.buscarTodos();
    }
    
    @PostMapping("/registrar")
    public Catedraticos insertar(@RequestBody(required = true) Catedraticos e1){
        return this.catedraticosservice.registrar(e1);
    }
}
