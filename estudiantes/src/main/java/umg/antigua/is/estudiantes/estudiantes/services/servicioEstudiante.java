/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.estudiantes.estudiantes.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.antigua.is.estudiantes.estudiantes.dao.RepositorioEstudiante;
import umg.antigua.is.estudiantes.estudiantes.model.Estudiante;


/**
 *
 * @author mariajose
 */
@Service
public class servicioEstudiante {
@Autowired
    private RepositorioEstudiante estudianterepo;

public List<Estudiante> buscarTodos(){
        List<Estudiante> lista = (List<Estudiante>) this.estudianterepo.findAll();
        return lista;
    }
    
public Estudiante registrar(Estudiante e1){
        return this.estudianterepo.save(e1);
    }


}
