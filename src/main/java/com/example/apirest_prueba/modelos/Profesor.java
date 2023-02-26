package com.example.apirest_prueba.modelos;

import jakarta.persistence.*;

@Entity(name = "Profesor")
@Table(name = "Profesor")
public class Profesor extends Persona{

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "Salario", nullable = false)
    public long salario;
    @Column(name = "Dependencia", nullable = false)
    public String dependencia;
    @Column(name = "Materia", nullable = false)
    public String materia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Profesor(){
        super();
    }
    public Profesor(String nombre_completo, Long identificacion, long numero_telefono, String email, String direccion_residencia, String genero, int salario, String dependencia, String materia) {
        super(nombre_completo, identificacion, numero_telefono, email, direccion_residencia, genero);
        this.salario = salario;
        this.dependencia = dependencia;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" +
                "idProfesor=" + id +
                ", salario=" + salario +
                ", dependencia='" + dependencia + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }

    @Override
    public String Comer() {
        System.out.println("La Clase Comer hereda de la super clase Persona");
        return null;
    }

    @Override
    public String Descansar() {
        System.out.println("La Clase  Descansar hereda de la super clase Persona");
        return null;
    }

    public void calificar(){  }

    public void prepartarClase(){ }

}
