package br.com.kbmg.wsconsultamedica.dto;

import java.time.LocalDateTime;

public class CompromissoDto{

	private Long idCompromisso;
	private LocalDateTime dataHoraConsulta;
	private MedicoDto medico;
	private PessoaDto pessoa;

	public Long getIdCompromisso() {
		return idCompromisso;
	}

	public void setIdCompromisso(Long idCompromisso) {
		this.idCompromisso = idCompromisso;
	}

	public LocalDateTime getDataHoraConsulta() {
		return dataHoraConsulta;
	}

	public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
		this.dataHoraConsulta = dataHoraConsulta;
	}

	public MedicoDto getMedico() {
		return medico;
	}

	public void setMedico(MedicoDto medico) {
		this.medico = medico;
	}

	public PessoaDto getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaDto pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
