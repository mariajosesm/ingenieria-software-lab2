/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.antigua.is.cursos.cursos.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mariajose
 */

@Entity
@Table(name="catedraticos")

public class Catedraticos implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "codigo_catedratico")
    private String codigo_catedratico;

    public Catedraticos() {
    }

    public Catedraticos(Long id, String nombres, String apellidos, String codigo_catedratico) {
        //this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo_catedratico = codigo_catedratico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo_catedratico() {
        return codigo_catedratico;
    }

    public void setCodigo_catedratico(String codigo_catedratico) {
        this.codigo_catedratico = codigo_catedratico;
    }
    
    
}
