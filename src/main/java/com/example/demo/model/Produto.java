
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Produto {
    private Long id;
    private String nome;
    private double custo, preco, qnt;
    private List<Imagem> imagens;
    private List<Categoria> categoria;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @JsonProperty(access = Access.WRITE_ONLY)//Não mostra os custos ao fazer o Serialização
    public double getCusto()
    {
        return custo;
    }

    public void setCusto(double custo) {

        this.custo = custo;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public double getQnt() {

        return qnt;
    }

    public void setQnt(double qnt) {

        this.qnt = qnt;
    }


    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="produto_id")

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }


    @ManyToMany()
    @JsonIgnore
    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }
}
