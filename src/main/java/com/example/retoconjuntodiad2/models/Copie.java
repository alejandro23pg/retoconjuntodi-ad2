package com.example.retoconjuntodiad2.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Copie implements Serializable {
    private Integer id;
    private Integer id_pelicula;
    private Integer id_usuario;
    private String estado;
    private String soporte;
}
