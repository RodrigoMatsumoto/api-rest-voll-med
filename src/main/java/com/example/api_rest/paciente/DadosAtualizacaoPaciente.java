package com.example.api_rest.paciente;

import com.example.api_rest.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(
    Long id,
    String nome,
    String telefone,
    
    @Valid
    DadosEndereco endereco
) { }