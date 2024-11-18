package com.example.retoconjuntodiad2.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_usuario")
    private String nombre;

    @Column(name = "contraseña")
    private String password;

    private Byte administrador;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<Copie> misCopias = new ArrayList<>(0);

    public void addCopie(Copie copie){
        copie.setUsuario(this);
        this.misCopias.add(copie);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", administrador=" + administrador +
                ", misCopias=" + misCopias +
                '}';
    }
}
