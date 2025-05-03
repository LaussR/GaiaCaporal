package dev.germantovar.springboot.repository.entities;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
@Entity
@Table(name = "productos")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproducto;

    private String nombre;
    private String descripcion;
    private Double precio;
    private String categoria;
    private String imagen;
}


