package com.pe.mabelistore.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_Usuario")
    private Long id;

    @Getter @Setter @Column(name = "nom_Usuario")
    private String nombre;

    @Getter @Setter @Column(name = "password")
    private String password;

}
