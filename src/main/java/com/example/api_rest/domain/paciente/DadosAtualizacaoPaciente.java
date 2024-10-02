package com.example.api_rest.domain.paciente;

import com.example.api_rest.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(
    Long id,
    String nome,
    String telefone,
    
    @Valid
    DadosEndereco endereco
) { }