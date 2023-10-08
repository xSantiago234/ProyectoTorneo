/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaltorneo.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectofinaltorneo.view.RegistroDeTorneos;
import static proyectofinaltorneo.view.RegistroDeTorneos.SelecSi;
import proyectofinaltorneo.view.cambioFechas;

/**
 *
 * @author MI PC
 */
public class administracionTorneo {

//    public ArrayList<torneo> torneo1 = new ArrayList<torneo>();
    public RegistroDeTorneos registro = new RegistroDeTorneos();
//
    torneo t;
    


    
   public void cambiarFechasDelTorneo()
   {
       String opcion = JOptionPane.showInputDialog("¿Desea cambiar alguna de las fechas registradas respecto al torneo? : Si(1) , No(2)");
       
       if(opcion.equals("1"))
       {
           cambioFechas fechas = new cambioFechas();
           
           fechas.setVisible(true);
       }

   }
   
    public static String validarLimite()
    { String cadena = "";
        if(RegistroDeTorneos.SelecSi.isSelected())
        {
           cadena = "Si";
        }
        else
        {
            cadena = "No";
                }
        return cadena;
    }
    
    
    public static String tipoTorneo()
    {
        String torneo="";
        
        if(tipoTorneo.local.isSelected())
        {
            torneo ="local";
        }
        else if(tipoTorneo.regional.isSelected()){
            torneo = "regional";
        }
        else if(tipoTorneo.nacional.isSelected())
        {
            torneo = "nacional";    
        }
        else if(tipoTorneo.mundial.isSelected())
        {
            torneo = "mundial";    
        }
                
        return torneo;
    }
}

    
     
     
   
     


