package com.algaworks.algalog.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Cliente {
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
}
