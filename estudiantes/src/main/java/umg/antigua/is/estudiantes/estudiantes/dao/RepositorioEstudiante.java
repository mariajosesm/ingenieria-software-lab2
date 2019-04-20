/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.estudiantes.estudiantes.dao;

import org.springframework.data.repository.CrudRepository;
import umg.antigua.is.estudiantes.estudiantes.model.Estudiante;

/**
 *
 * @author mariajose
 */
public interface RepositorioEstudiante extends CrudRepository<Estudiante, Integer> {
    
}
