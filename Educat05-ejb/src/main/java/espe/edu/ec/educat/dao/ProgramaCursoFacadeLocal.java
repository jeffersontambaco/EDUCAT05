/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.ProgramaCurso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jeffe
 */
@Local
public interface ProgramaCursoFacadeLocal {

    void create(ProgramaCurso programaCurso);

    void edit(ProgramaCurso programaCurso);

    void remove(ProgramaCurso programaCurso);

    ProgramaCurso find(Object id);

    List<ProgramaCurso> findAll();

    List<ProgramaCurso> findRange(int[] range);

    int count();
    
}
