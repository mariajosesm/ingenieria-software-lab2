/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.cursos.cursos.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.antigua.is.cursos.cursos.dao.RepositorioCurso;
import umg.antigua.is.cursos.cursos.model.Curso;

/**
 *
 * @author mariajose
 */
@Service
public class servicioCurso {
    
@Autowired
    private RepositorioCurso cursorepo;

public List<Curso> buscarTodos(){
        List<Curso> lista = (List<Curso>) this.cursorepo.findAll();
        return lista;
    }
    
public Curso crear(Curso e1){
        return this.cursorepo.save(e1);
    }
}
