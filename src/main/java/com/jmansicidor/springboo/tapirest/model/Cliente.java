package com.jmansicidor.springboo.tapirest.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Data
@Getter @Setter
@Entity //con entidad transformamos la calse cliente como tabla en la db
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //genera de forma secuencial. mas untiizada
    private long id;

    @NonNull
    private String nombre;
    @NonNull
    private String apellido;

    @NonNull
    private String email;
    private int edad;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    @PrePersist
    public void prePersist(){
        createAt = new Date();
    }

    private static final long serilaVersionUID =1L;

    public Cliente(){

    }

}
