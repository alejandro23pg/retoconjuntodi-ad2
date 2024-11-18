package com.example.retoconjuntodiad2.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "peliculas")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String genero;

    @Column(name = "año")
    private Integer year;

    private String descripcion;

    private String director;

    private String poster;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", year=" + year +
                ", descripcion='" + descripcion + '\'' +
                ", director='" + director + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
