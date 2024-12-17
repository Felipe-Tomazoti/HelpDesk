package com.felipe.helpdesk.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.felipe.helpdesk.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa {

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        addPerfil(Perfil.ClIENTE);
    }

    public Cliente(String senha, String email, String cpf, String nome, Integer id) {
        super(senha, email, cpf, nome, id);
        addPerfil(Perfil.ClIENTE);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
