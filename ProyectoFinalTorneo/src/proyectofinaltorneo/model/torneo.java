/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinaltorneo.model;

/**
 *
 * @author MI PC
 */
public class torneo {
    
    private String nombre;
    private String tipoTorneo;
    private String canEquipos;
    private String limiteDeEdad;
    private String limite;
    private String fechaIniInscripciones;
    private String fechaFinInscripciones;
    private String precioInscripcion;
    private String duracionDelTorneo;
    private String fechaIniTorneo;

    public torneo(String nombre, String tipoTorneo, String canEquipos, String limiteDeEdad, String limite, String fechaIniInscripciones, String fechaFinInscripciones, String precioInscripcion, String duracionDelTorneo, String fechaIniTorneo) {
        this.nombre = nombre;
        this.tipoTorneo = tipoTorneo;
        this.canEquipos = canEquipos;
        this.limiteDeEdad = limiteDeEdad;
        this.limite = limite;
        this.fechaIniInscripciones = fechaIniInscripciones;
        this.fechaFinInscripciones = fechaFinInscripciones;
        this.precioInscripcion = precioInscripcion;
        this.duracionDelTorneo = duracionDelTorneo;
        this.fechaIniTorneo = fechaIniTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(String tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public String getCanEquipos() {
        return canEquipos;
    }

    public void setCanEquipos(String canEquipos) {
        this.canEquipos = canEquipos;
    }

    public String getLimiteDeEdad() {
        return limiteDeEdad;
    }

    public void setLimiteDeEdad(String limiteDeEdad) {
        this.limiteDeEdad = limiteDeEdad;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public String getFechaIniInscripciones() {
        return fechaIniInscripciones;
    }

    public void setFechaIniInscripciones(String fechaIniInscripciones) {
        this.fechaIniInscripciones = fechaIniInscripciones;
    }

    public String getFechaFinInscripciones() {
        return fechaFinInscripciones;
    }

    public void setFechaFinInscripciones(String fechaFinInscripciones) {
        this.fechaFinInscripciones = fechaFinInscripciones;
    }

    public String getPrecioInscripcion() {
        return precioInscripcion;
    }

    public void setPrecioInscripcion(String precioInscripcion) {
        this.precioInscripcion = precioInscripcion;
    }

    public String getDuracionDelTorneo() {
        return duracionDelTorneo;
    }

    public void setDuracionDelTorneo(String duracionDelTorneo) {
        this.duracionDelTorneo = duracionDelTorneo;
    }

    public String getFechaIniTorneo() {
        return fechaIniTorneo;
    }

    public void setFechaIniTorneo(String fechaIniTorneo) {
        this.fechaIniTorneo = fechaIniTorneo;
    }

    

}