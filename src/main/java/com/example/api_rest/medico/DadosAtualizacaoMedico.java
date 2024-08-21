package com.example.api_rest.medico;

import com.example.api_rest.endereco.DadosEndereco;
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