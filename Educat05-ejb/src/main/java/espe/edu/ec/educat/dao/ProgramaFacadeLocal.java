/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Programa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jeffe
 */
@Local
public interface ProgramaFacadeLocal {

    void create(Programa programa);

    void edit(Programa programa);

    void remove(Programa programa);

    Programa find(Object id);

    List<Programa> findAll();

    List<Programa> findRange(int[] range);

    int count();
    
}
