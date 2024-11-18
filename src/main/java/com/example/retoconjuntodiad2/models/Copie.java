package com.example.retoconjuntodiad2.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Entity
@Table(name = "copias")
public class Copie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_pelicula")
    private Integer idPelicula;

    private Integer idUsuario;

    private String estado;

    private String soporte;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private User usuario;

    @Override
    public String toString() {
        return "Copie{" +
                "id=" + id +
                ", idPelicula=" + idPelicula +
                ", estado='" + estado + '\'' +
                ", soporte='" + soporte + '\'' +
                ", usuario=" + usuario.getNombre() +
                '}';
    }
}
