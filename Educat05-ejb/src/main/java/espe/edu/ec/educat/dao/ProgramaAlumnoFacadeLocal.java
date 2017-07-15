/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.ProgramaAlumno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jeffe
 */
@Local
public interface ProgramaAlumnoFacadeLocal {

    void create(ProgramaAlumno programaAlumno);

    void edit(ProgramaAlumno programaAlumno);

    void remove(ProgramaAlumno programaAlumno);

    ProgramaAlumno find(Object id);

    List<ProgramaAlumno> findAll();

    List<ProgramaAlumno> findRange(int[] range);

    int count();
    
}
