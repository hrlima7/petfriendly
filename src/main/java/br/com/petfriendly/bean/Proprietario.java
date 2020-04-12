package br.com.petfriendly.bean;


	import java.io.Serializable;
	import java.sql.Time;
	import java.util.Date;
	import java.util.List;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	@Entity
	@Table(name = "tb_proprietario")
	public class Proprietario implements Serializable {
		private static final long serialVersionUID = 1L;

		
		
		@Id
		@Column(name="id_proprietario")
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="proprietario")
		@SequenceGenerator(name="proprietario",sequenceName="SQ_T_PROPRIETARIO",allocationSize=1)
		Integer id;

		@Column(name = "nm_proprietario", length = 40)
		String nome;
		
		@Column(name ="nm_sobrenome", length =  40)
		String sobreNome;
		
		@Column(name="email", length = 60)
		String email;		
		
		@Column(name="tp_senha" , length=8)
		String senha ;

		@Column(name = "tp_sexo", length = 1)
		String sexo;

		public String getSobreNome() {
			return sobreNome;
		}

		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		@Column(name = "img_cadastro", length = 120)
		String foto;

		@Column(name = "nr_cep", length = 9)
		String CEP;

		@Column(name = "dt_criacao")
		@Temporal(TemporalType.DATE)
		Date dtCriacao;

		@Column(name = "hr_criacao")
		Time hrCriacao;

		
		@OneToMany(mappedBy="proprietario")
		private  List<Animal> animais;
		
		public Proprietario() {
			super();
		}

		public Proprietario(Integer id, String nome, String sexo, String foto, String CEP, Date dtCriacao, Time hrCriacao) {
			super();
			this.id = id;
			nome =foto = foto;
			this.CEP = CEP;
			this.dtCriacao = dtCriacao;
			this.hrCriacao = hrCriacao;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public String getCEP() {
			return CEP;
		}

		public void setCEP(String cEP) {
			this.CEP = cEP;
		}

		public Date getDtCriacao() {
			return dtCriacao;
		}

		public Time getHrCriacao() {
			return hrCriacao;
		}

	
		public void setDtCriacao(Date dtCriacao) {
			this.dtCriacao = dtCriacao;
		}

		public void setHrCriacao(Time hrCriacao) {
			this.hrCriacao = hrCriacao;
		}

		public List<Animal> getAnimais() {
			return animais;
		}

		public void setAnimais(List<Animal> animais) {
			this.animais = animais;
		}
		
		
		
	}

	

