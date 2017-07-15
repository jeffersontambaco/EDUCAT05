/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Capacitacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jeffe
 */
@Local
public interface CapacitacionFacadeLocal {

    void create(Capacitacion capacitacion);

    void edit(Capacitacion capacitacion);

    void remove(Capacitacion capacitacion);

    Capacitacion find(Object id);

    List<Capacitacion> findAll();

    List<Capacitacion> findRange(int[] range);

    int count();
    
}
