package com.examen_1.domain;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")

public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vehiculo;
    
    String descripcion,fecha_salida;
    int cilindros;

    public Vehiculo() {
    }

    public Vehiculo(String descripcion, String fecha_salida, int cilindros) {
        this.descripcion = descripcion;
        this.fecha_salida = fecha_salida;
        this.cilindros = cilindros;
    } 
}
