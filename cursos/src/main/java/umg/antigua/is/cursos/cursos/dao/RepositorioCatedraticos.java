/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.cursos.cursos.dao;

import org.springframework.data.repository.CrudRepository;
import umg.antigua.is.cursos.cursos.model.Catedraticos;

/**
 *
 * @author mariajose
 */
public interface RepositorioCatedraticos extends CrudRepository<Catedraticos, Integer>{
    
}
