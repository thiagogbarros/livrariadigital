package livrariadigital;

import java.util.ArrayList;

public class Usuario {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private int cpf;
	private String nome;
	private int idade;
	private String endereco;
	private int telefone;
	private int cep;
	public Usuario(int id) {
		this.setId(id);
	}
	public static ArrayList<Usuario> criarUsuario() {
		ArrayList <Usuario> usuarioBD = BancoDeDados.createUsuarioBD();
		int id = BancoDeDados.getLastIdUsuarioBD(usuarioBD);
		Usuario usuario = new Usuario(id);
		BancoDeDados.addUsuarioBD(usuarioBD, usuario);
		return usuarioBD;
	}
	
	public void excluir(Usuario x) {
		x = null;	//nao haverá referencia para o objeto, logo sera deletado pelo garbage collector.
	}
	
	public void consultarPerfil(Usuario x) {
		System.out.printf("CPF: \n",x.getCpf());
		System.out.printf("NOME: \n",x.getNome());
		System.out.printf("IDADE: \n",x.getIdade());
		System.out.printf("ENDERECO: \n",x.getEndereco());
		System.out.printf("TELEFONE: \n",x.getTelefone());
		System.out.printf("CEP: \n",x.getCep());
	}
	

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
}