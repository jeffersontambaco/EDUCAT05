/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.ProgramaCurso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jeffe
 */
@Stateless
public class ProgramaCursoFacade extends AbstractFacade<ProgramaCurso> implements ProgramaCursoFacadeLocal {

    @PersistenceContext(unitName = "espe.edu.ec.educat_Educat05-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaCursoFacade() {
        super(ProgramaCurso.class);
    }
    
}
