package com.felipe.helpdesk.services;

import com.felipe.helpdesk.domain.Chamado;
import com.felipe.helpdesk.domain.Cliente;
import com.felipe.helpdesk.domain.Tecnico;
import com.felipe.helpdesk.domain.enums.Perfil;
import com.felipe.helpdesk.domain.enums.Prioridade;
import com.felipe.helpdesk.domain.enums.Status;
import com.felipe.helpdesk.repositories.ChamadoRepository;
import com.felipe.helpdesk.repositories.ClienteRepository;
import com.felipe.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;


    public void instanciaDB(){
        Tecnico tec1 = new Tecnico(encoder.encode("321"), "valdir@mail.com", "55653080039", "Valdir Cezar", null);
        tec1.addPerfil(Perfil.ADMIN);

        Tecnico tec2 = new Tecnico(encoder.encode("321"), "moacir@mail.com", "21171887027", "Moacir", null);
        tec1.addPerfil(Perfil.TECNICO);

        Cliente cli1 = new Cliente(encoder.encode("321"), "torvalds@mail.com", "99799820049", "Linus Torvalds", null);

        Chamado c1 = new Chamado(cli1,tec1, "Primeiro chamado", "Chamado 01", Status.ANDAMENTO, Prioridade.MEDIA, null);

        tecnicoRepository.saveAll(Arrays.asList(tec1, tec2));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
