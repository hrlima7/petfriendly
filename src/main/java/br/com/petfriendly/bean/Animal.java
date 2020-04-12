package br.com.petfriendly.bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_animal")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_animal")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="animal")
	@SequenceGenerator(name="animal",sequenceName="SQ_T_ANIMAL",allocationSize=1)
	Integer idAnimal;
	
	@Column(name = "id_usuario")
	Integer idUsuario;	
	
	@Column(name = "nm_animal", length = 40)
	String nome;
	
	@Column(name = "tp_especie", length = 20)
	String especie;
	
	@Column(name = "raca", length = 30)
	String raca;
	
	@Column(name = "dt_criacao")
	@Temporal(TemporalType.DATE)
	Calendar dtCriacao;
	
	@Column(name = "hr_criacao")
	Time hrCriacao;

	@ManyToOne
	@JoinColumn(name="id_proprietario" )
	private Proprietario proprietario;
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Calendar getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Calendar dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public Time getHrCriacao() {
		return hrCriacao;
	}

	public void setHrCriacao(Time hrCriacao) {
		this.hrCriacao = hrCriacao;
	}

//	public Proprietario getProprietario() {
//		return proprietario;
//	}
//
//	public void setProprietario(Proprietario proprietario) {
//		this.proprietario = proprietario;
//	}

	public Integer getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
}
