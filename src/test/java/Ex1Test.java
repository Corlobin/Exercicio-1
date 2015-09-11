/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ifes.ex1.modelo.Medico;
import com.ifes.ex1.modelo.Paciente;
import com.ifes.ex1.control.Consulta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20122BSI0387
 */
public class Ex1Test {
    
    
    public Ex1Test() {
    }
    
    @Before
    public void Before() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test     
     public void paciente() {
         Paciente paciente = new Paciente();
         paciente.setNome("Paulo");
         Assert.assertEquals(paciente.getNome(), "Paul");
     }
     @Test
     public void consulta() {
         Consulta consulta = new Consulta();
         Medico medico = new Medico();
         medico.setNome("Ricardao");
         consulta.setMedico(medico);
         Assert.assertEquals(consulta.getMedico().getNome(), "Ricardao");         
     }
     @Test
     public void medico() {
         Medico medico = new Medico();
         medico.setCRM(3333);
         Assert.assertEquals(medico.getCRM(), 3333);                 
     }
     
     
}
