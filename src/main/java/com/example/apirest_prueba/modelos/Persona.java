package com.example.apirest_prueba.modelos;


public abstract class Persona {

    public String nombre_completo;

    public long identificacion;

    public long numero_telefono;

    public String email;

    public String direccion_residencia;

    public String genero;

    public Persona() {

    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public long getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(Integer numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion_residencia() {
        return direccion_residencia;
    }

    public void setDireccion_residencia(String direccion_residencia) {
        this.direccion_residencia = direccion_residencia;
    }

    public String getGenero() {
        return genero;
    }

   public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract String Comer();

    public abstract String Descansar();

    public Persona(String nombre_completo, long identificacion, long numero_telefono, String email, String direccion_residencia, String genero) {
        this.nombre_completo = nombre_completo;
        this.identificacion = identificacion;
        this.numero_telefono = numero_telefono;
        this.email = email;
        this.direccion_residencia = direccion_residencia;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre_completo='" + nombre_completo + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", numero_telefono=" + numero_telefono +
                ", email='" + email + '\'' +
                ", direccion_residencia='" + direccion_residencia + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
