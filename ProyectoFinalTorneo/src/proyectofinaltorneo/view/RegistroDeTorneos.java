/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinaltorneo.view;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import proyectofinaltorneo.model.administracionTorneo;
import proyectofinaltorneo.model.torneo;

/**
 *
 * @author MI PC
 */
public class RegistroDeTorneos extends javax.swing.JFrame {
     public ArrayList<torneo> torneo1 = new ArrayList<torneo>();
    /**
     * Creates new form RegistroDeTorneos
     */
    public RegistroDeTorneos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        limiteEdad = new javax.swing.JLabel();
        TItulo = new javax.swing.JLabel();
        maxEquipos = new javax.swing.JLabel();
        NombreTorneo = new javax.swing.JLabel();
        SelecNo = new javax.swing.JRadioButton();
        SelecSi = new javax.swing.JRadioButton();
        limiteEdadTitulo = new javax.swing.JLabel();
        limiteT = new javax.swing.JTextField();
        numeroEquiposT = new javax.swing.JTextField();
        nombreTorneoT = new javax.swing.JTextField();
        fechaInicioInscripciones = new javax.swing.JLabel();
        fechaCierreInscripciones = new javax.swing.JLabel();
        valorInscripcion = new javax.swing.JLabel();
        precioInscriT = new javax.swing.JTextField();
        fechaInicioTorneo = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        fechaInicioT = new com.toedter.calendar.JDateChooser();
        fechaIniTexto = new javax.swing.JTextField();
        fechaCierreTexto = new javax.swing.JTextField();
        duracionTorneo = new javax.swing.JLabel();
        CalcularDias = new javax.swing.JButton();
        fechaInicioTornetoTexto = new javax.swing.JTextField();
        GuardarDatos = new javax.swing.JButton();
        mostrarDatos = new javax.swing.JButton();

        limiteEdad.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        limiteEdad.setText("¿Hay limite de edad");

        TItulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        TItulo.setText("REGISTRO DEL TORNEO");

        maxEquipos.setDisplayedMnemonic('M');
        maxEquipos.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        maxEquipos.setText("Numero max. de equipos:");

        NombreTorneo.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        NombreTorneo.setText("Nombre del torneo");

        SelecNo.setText("No");
        SelecNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecNoActionPerformed(evt);
            }
        });

        SelecSi.setText("Si");
        SelecSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecSiActionPerformed(evt);
            }
        });

        limiteEdadTitulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        limiteEdadTitulo.setText("Ingrese el limite");

        limiteT.setEnabled(false);
        limiteT.setName(""); // NOI18N
        limiteT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limiteTActionPerformed(evt);
            }
        });

        numeroEquiposT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroEquiposTKeyTyped(evt);
            }
        });

        nombreTorneoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTorneoTActionPerformed(evt);
            }
        });
        nombreTorneoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTorneoTKeyTyped(evt);
            }
        });

        fechaInicioInscripciones.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        fechaInicioInscripciones.setText("Fecha de inicio de las inscripciones:");

        fechaCierreInscripciones.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        fechaCierreInscripciones.setText("Fecha de cierre de las inscripciones:");

        valorInscripcion.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        valorInscripcion.setText("Valor Inscripcion $");

        precioInscriT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioInscriTActionPerformed(evt);
            }
        });
        precioInscriT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioInscriTKeyTyped(evt);
            }
        });

        fechaInicioTorneo.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        fechaInicioTorneo.setText("Fecha inicio del torneo:");

        fechaInicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaInicioPropertyChange(evt);
            }
        });

        fechaFinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaFinalPropertyChange(evt);
            }
        });

        fechaInicioT.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaInicioTPropertyChange(evt);
            }
        });

        fechaIniTexto.setEditable(false);
        fechaIniTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaIniTextoActionPerformed(evt);
            }
        });

        fechaCierreTexto.setEditable(false);
        fechaCierreTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCierreTextoActionPerformed(evt);
            }
        });

        duracionTorneo.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        duracionTorneo.setText("....");

        CalcularDias.setText("CAL.DIAS");
        CalcularDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularDiasActionPerformed(evt);
            }
        });

        fechaInicioTornetoTexto.setEditable(false);
        fechaInicioTornetoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaInicioTornetoTextoActionPerformed(evt);
            }
        });

        GuardarDatos.setText("GUARDAR DATOS");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });

        mostrarDatos.setText("MOSTRAR DATOS");
        mostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(limiteEdad)
                        .addGap(70, 70, 70)
                        .addComponent(SelecSi)
                        .addGap(67, 67, 67)
                        .addComponent(SelecNo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(maxEquipos)
                                            .addGap(18, 18, 18)
                                            .addComponent(numeroEquiposT))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(NombreTorneo)
                                            .addGap(18, 18, 18)
                                            .addComponent(nombreTorneoT, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(174, 174, 174)
                                        .addComponent(TItulo)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fechaCierreInscripciones)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fechaInicioInscripciones)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addComponent(limiteEdadTitulo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(limiteT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(90, 90, 90)))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valorInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(precioInscriT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaIniTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CalcularDias, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaCierreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(duracionTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fechaInicioTorneo)
                        .addGap(18, 18, 18)
                        .addComponent(fechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaInicioTornetoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarDatos)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TItulo)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxEquipos)
                    .addComponent(numeroEquiposT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTorneo)
                    .addComponent(nombreTorneoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(limiteEdadTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecNo)
                    .addComponent(limiteT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelecSi)
                    .addComponent(limiteEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalcularDias)
                    .addComponent(duracionTorneo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaInicioInscripciones)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaIniTexto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaCierreTexto)
                    .addComponent(fechaCierreInscripciones, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorInscripcion)
                    .addComponent(precioInscriT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaInicioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicioTorneo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fechaInicioTornetoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mostrarDatos)))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void SelecNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecNoActionPerformed
        // TODO add your handling code here:
        grupoBotones.add(SelecSi);
         grupoBotones.add(SelecNo);
         
         
        
           
        
    }//GEN-LAST:event_SelecNoActionPerformed

     public void calcularDias(JDateChooser fechaInicio,JDateChooser fechaFinal)
    {
        if(fechaInicio.getDate()!= null||fechaFinal.getDate()!= null)
        {
            Calendar inicio = fechaInicio.getCalendar();
            Calendar termino = fechaFinal.getCalendar();
            int dias = -1;
        
            
            while(inicio.before(termino)  || inicio.before(termino))
            {
                dias++;
                inicio.add(Calendar.DATE,1);
            
 
            duracionTorneo.setText(""+dias);
    }
        }
            else{
                    JOptionPane.showMessageDialog(null,"Seleccione dlas fechas","",JOptionPane.ERROR_MESSAGE);
                    }
        
    }
     
    private void SelecSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecSiActionPerformed
        // TODO add your handling code here: grupoBotones.add(SelecNo);
          grupoBotones.add(SelecSi);
         grupoBotones.add(SelecNo);
        
         if(SelecSi.isSelected())
        {
            limiteT.setEnabled(true);
        }
         else if(SelecSi.isSelected())
         {
             limiteT.setEnabled( false);
         }
    }//GEN-LAST:event_SelecSiActionPerformed

    private void limiteTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limiteTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limiteTActionPerformed

    private void nombreTorneoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTorneoTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nombreTorneoTActionPerformed
//public void guardarFechas()
//{
//    String fecha="";
//    if(fechaInicio!=null)
//    fecha =fechaInicio.toString();
//    System.out.println(fecha);
//}
    private void numeroEquiposTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroEquiposTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_numeroEquiposTKeyTyped

    private void nombreTorneoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTorneoTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')) evt.consume();
    }//GEN-LAST:event_nombreTorneoTKeyTyped

    private void precioInscriTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioInscriTKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        
        if(c<'0'||c>'9') evt.consume();
        
    }//GEN-LAST:event_precioInscriTKeyTyped

    private void fechaIniTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaIniTextoActionPerformed
        // TODO add your handling code here:
        fechaIniTexto.setVisible(false);
    }//GEN-LAST:event_fechaIniTextoActionPerformed

    private void fechaInicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaInicioPropertyChange
        
        if(evt.getOldValue()!=null)
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            fechaIniTexto.setText(formato.format(fechaInicio.getCalendar().getTime()));
        }
        
       
    }//GEN-LAST:event_fechaInicioPropertyChange
    
   
    
    
    
    
    private void fechaFinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaFinalPropertyChange
        
         if(evt.getOldValue()!=null)
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            fechaCierreTexto.setText(formato.format(fechaFinal.getCalendar().getTime()));
        }
    }//GEN-LAST:event_fechaFinalPropertyChange

    private void fechaCierreTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCierreTextoActionPerformed
        // TODO add your handling code here:
        fechaCierreTexto.setVisible(false);
    }//GEN-LAST:event_fechaCierreTextoActionPerformed

    private void CalcularDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularDiasActionPerformed
        // TODO add your handling code here:
        
        calcularDias(fechaInicio, fechaFinal);
    }//GEN-LAST:event_CalcularDiasActionPerformed

    private void fechaInicioTPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaInicioTPropertyChange
        // TODO add your handling code here:
         if(evt.getOldValue()!=null)
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            fechaInicioTornetoTexto.setText(formato.format(fechaInicioT.getCalendar().getTime()));
        }
    }//GEN-LAST:event_fechaInicioTPropertyChange

    private void fechaInicioTornetoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaInicioTornetoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaInicioTornetoTextoActionPerformed
    
     torneo t ;
     
    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
           
    try
    {
        
        String nombre = nombreTorneoT.getText();
        String canEquipos =numeroEquiposT.getText();
        String  hayLimite = administracionTorneo.validarLimite();
        String limite = limiteT.getText();
        String fechaIni = fechaIniTexto.getText();
        String fechaFin = fechaCierreTexto.getText();
        String precio =  precioInscriT.getText();
        String duracionTorneo = this.duracionTorneo.getText();
        String fechaIniTorneo = fechaInicioTornetoTexto.getText();
        String tipoTorneo = administracionTorneo.tipoTorneo();
        t = new torneo(nombre, tipoTorneo, canEquipos, limite, limite, fechaIniTorneo, fechaIniTorneo, duracionTorneo, duracionTorneo, fechaIniTorneo);
        torneo1.add(t);
    }
    catch(NumberFormatException ex)
    {
        JOptionPane.showMessageDialog(null,"ERROR se introdujo de forma erronea un dato");
    }
    }//GEN-LAST:event_GuardarDatosActionPerformed

    private void precioInscriTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioInscriTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioInscriTActionPerformed

    private void mostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDatosActionPerformed
        // TODO add your handling code here:
              for (int i = 0; i < torneo1.size(); i++)
       {
          JOptionPane.showMessageDialog(null,"Torneo "+(i+1)+"\n"
                   +"CanEquipos :"+torneo1.get(i).getCanEquipos()+
                   "\nNombre del torneo :"+torneo1.get(i).getNombre()
                  +"\nTipo torneo : "+torneo1.get(i).getTipoTorneo()
               +"\nHay limite de edad : "+torneo1.get(i).getLimiteDeEdad()
                  +"\nLimite :"+torneo1.get(i).getLimite()
               +"\nFecha inicio Inscrip. :" + torneo1.get(i).getFechaIniInscripciones()
               +"\nFecha Fin Inscrip. :" + torneo1.get(i).getFechaFinInscripciones()
               +"\nFecha Inicio del torneo :" + torneo1.get(i).getFechaIniTorneo()
            );
        }
    }//GEN-LAST:event_mostrarDatosActionPerformed
    
   
    
    
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroDeTorneos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeTorneos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeTorneos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeTorneos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeTorneos().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton CalcularDias;
    public static javax.swing.JButton GuardarDatos;
    public static javax.swing.JLabel NombreTorneo;
    public static javax.swing.JRadioButton SelecNo;
    public static javax.swing.JRadioButton SelecSi;
    private javax.swing.JLabel TItulo;
    private javax.swing.JLabel duracionTorneo;
    public static javax.swing.JLabel fechaCierreInscripciones;
    public static javax.swing.JTextField fechaCierreTexto;
    public static com.toedter.calendar.JDateChooser fechaFinal;
    public static javax.swing.JTextField fechaIniTexto;
    public static com.toedter.calendar.JDateChooser fechaInicio;
    public static javax.swing.JLabel fechaInicioInscripciones;
    public static com.toedter.calendar.JDateChooser fechaInicioT;
    public static javax.swing.JLabel fechaInicioTorneo;
    public static javax.swing.JTextField fechaInicioTornetoTexto;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel limiteEdad;
    public static javax.swing.JLabel limiteEdadTitulo;
    public static javax.swing.JTextField limiteT;
    public static javax.swing.JLabel maxEquipos;
    public static javax.swing.JButton mostrarDatos;
    public static javax.swing.JTextField nombreTorneoT;
    public static javax.swing.JTextField numeroEquiposT;
    public static javax.swing.JTextField precioInscriT;
    public static javax.swing.JLabel valorInscripcion;
    // End of variables declaration//GEN-END:variables
}
