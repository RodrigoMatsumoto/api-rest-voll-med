package com.example.api_rest.paciente;

import com.example.api_rest.endereco.DadosEndereco;

public record DadosCadastroPaciente(
    String nome,
    String email,
    String telefone,
    String cpf,
    DadosEndereco endereco
) { }