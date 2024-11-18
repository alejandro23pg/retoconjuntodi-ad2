package com.example.retoconjuntodiad2.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CopieDTO {
    private Long idMovie;
    private Long idUser;
    private String titulo;
    private String genero;
    private Integer year;
    private String director;
    private String soporte;
    private String estado;
}
