package com.example.api_rest.domain.medico;

import com.example.api_rest.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
    @NotNull
    Long id,
    
    String nome,
    String telefone,
    
    @Valid
    DadosEndereco endereco
) { }