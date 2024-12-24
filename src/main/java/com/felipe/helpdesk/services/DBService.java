package com.felipe.helpdesk.services;

import com.felipe.helpdesk.domain.Chamado;
import com.felipe.helpdesk.domain.Cliente;
import com.felipe.helpdesk.domain.Tecnico;
import com.felipe.helpdesk.domain.enums.Perfil;
import com.felipe.helpdesk.domain.enums.Prioridade;
import com.felipe.helpdesk.domain.enums.Status;
import com.felipe.helpdesk.repositories.ChamadoRepository;
import com.felipe.helpdesk.repositories.ClienteRepository;
import com.felipe.helpdesk.repositories.PessoaRepository;
import com.felipe.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private ChamadoRepository chamadoRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;
    @Autowired
    private PessoaRepository pessoaRepository;


    public void instanciaDB(){
        Tecnico admin = new Tecnico(encoder.encode("admin"), "admin@mail.com", "55653080039", "Administrador", null);
        admin.addPerfil(Perfil.ADMIN);

        Tecnico tec1 = new Tecnico(encoder.encode("123"), "valdir@mail.com", "550.482.150-95", "Valdir Cezar", null);
        Tecnico tec2 = new Tecnico(encoder.encode("123"), "stallman@mail.com", "903.347.070-56", "Richard Stallman", null);
        Tecnico tec3 = new Tecnico(encoder.encode("123"), "shannon@mail.com", "271.068.470-54", "Claude Elwood Shannon", null);
        Tecnico tec4 = new Tecnico(encoder.encode("123"), "lee@mail.com", "162.720.120-39", "Tim Berners-Lee", null);
        Tecnico tec5 = new Tecnico(encoder.encode("123"), "linus@mail.com", "778.556.170-27", "Linus Torvalds", null);

        Cliente cli1 = new Cliente(encoder.encode("123"), "einstein@mail.com", "111.661.890-74", "Albert Einstein", null);
        Cliente cli2 = new Cliente(encoder.encode("123"), "curie@mail.com", "322.429.140-06", "Marie Curie", null);
        Cliente cli3 = new Cliente(encoder.encode("123"), "darwin@mail.com", "792.043.830-62", "Charles Darwin", null);
        Cliente cli4 = new Cliente(encoder.encode("123"), "hawking@mail.com", "177.409.680-30", "Stephen Hawking", null);
        Cliente cli5 = new Cliente(encoder.encode("123"), "planck@mail.com", "081.399.300-83", "Max Planck", null);

        Chamado c1 = new Chamado(cli1, tec1, "Teste chamado 1", "Chamado 1", Status.ANDAMENTO, Prioridade.MEDIA, null);
        Chamado c2 = new Chamado(cli2, tec1, "Teste chamado 2", "Chamado 2", Status.ABERTO, Prioridade.ALTA, null);
        Chamado c3 = new Chamado(cli3, tec2, "Teste chamado 3", "Chamado 3", Status.ENCERRADO, Prioridade.BAIXA, null);
        Chamado c4 = new Chamado(cli3, tec3, "Teste chamado 4", "Chamado 4", Status.ABERTO, Prioridade.ALTA, null);
        Chamado c5 = new Chamado(cli1, tec2, "Teste chamado 5", "Chamado 5", Status.ANDAMENTO, Prioridade.MEDIA, null);
        Chamado c6 = new Chamado(cli5, tec1, "Teste chamado 6", "Chamado 7", Status.ENCERRADO, Prioridade.BAIXA, null);

        pessoaRepository.saveAll(Arrays.asList(admin, tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));
        chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
    }
}
