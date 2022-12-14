package br.fatec.vidapet.model;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("funcionario")
public class Funcionario extends Usuario {
	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Servico servico;
}
