package com.example.apirest_prueba.modelos;

import jakarta.persistence.*;

@Entity(name = "Alumno")
@Table(name = "Alumno")
public class Alumno extends Persona {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue()
    private long idAlumno;
    @Column(name = "Numero_Matricula", nullable = false)
    public long numero_matricula;
    @Column(name = "Programa", nullable = false)
    public String programa;
    @Column(name = "Nota_Promedio", nullable = false)
    public double nota_promedio;

    public long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public long getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(long numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getNota_promedio() {
        return nota_promedio;
    }

    public void setNota_promedio(double nota_promedio) {
        this.nota_promedio = nota_promedio;
    }


    public Alumno() {
        super();
    }

    public Alumno(String nombre_completo, long identificacion, long numero_telefono, String email, String direccion_residencia, String genero, long numero_matricula, String programa, double nota_promedio) {
        super(nombre_completo, identificacion, numero_telefono, email, direccion_residencia, genero);
        this.numero_matricula = numero_matricula;
        this.programa = programa;
        this.nota_promedio = nota_promedio;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" +
                "nombre_completo='" + nombre_completo + '\'' +
                ", identificacion=" + identificacion +
                ", numero_telefono=" + numero_telefono +
                ", email='" + email + '\'' +
                ", direccion_residencia='" + direccion_residencia + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
    @Override
    public String Comer() {
        System.out.println("La Clase Comer hereda de la super clase Persona");
        return null;
    }
    @Override
    public String Descansar() { System.out.println("La Clase Descansar hereda de la super clase Persona");
        return null;
    }
    public void estudiar(){ }

 }
