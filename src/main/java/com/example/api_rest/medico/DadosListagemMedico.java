package com.example.api_rest.medico;

public record DadosListagemMedico(
    String nome,
    String email,
    String crm,
    Especialidade especialidade
) {
  public DadosListagemMedico(Medico medico) {
    this(
        medico.getNome(),
        medico.getEmail(),
        medico.getCrm(),
        medico.getEspecialidade()
    );
  }
}