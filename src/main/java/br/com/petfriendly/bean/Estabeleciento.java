package br.com.petfriendly.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ESTABELECIMENTO")
public class Estabeleciento implements Serializable  {

	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="id_estabelecimento")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="estabelecimento")
	@SequenceGenerator(name="estabelecimento",sequenceName="SQ_T_ESTABELECIMENTO",allocationSize=1)
	private Integer id;
	
	
	@Column(name="nm_estabelecimento")
	private String nomeEstabelecimento;
	
	@Column(name="nm_categoria")
	private String categoria;
	
	

	public Estabeleciento(Integer id, String nomeEstabelecimento, String categoria) {
		super();
		this.id = id;
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.categoria = categoria;
	}

	public Estabeleciento() {
		super();
		
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}
	
	

}
