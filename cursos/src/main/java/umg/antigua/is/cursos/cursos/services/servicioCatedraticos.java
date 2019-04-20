/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.cursos.cursos.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.antigua.is.cursos.cursos.dao.RepositorioCatedraticos;
import umg.antigua.is.cursos.cursos.model.Catedraticos;

/**
 *
 * @author mariajose
 */
@Service
public class servicioCatedraticos {
    
@Autowired
    private RepositorioCatedraticos catedraticosrepo;

    public List<Catedraticos> buscarTodos(){
        List<Catedraticos> lista = (List<Catedraticos>) this.catedraticosrepo.findAll();
        return lista;
    }
    
    public Catedraticos registrar(Catedraticos e1){
        return this.catedraticosrepo.save(e1);
    }


}
