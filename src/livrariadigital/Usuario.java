package livrariadigital;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	public static ArrayList<Usuario> criarUsuario() {
		ArrayList <Usuario> usuarioBD = BancoDeDados.createUsuarioBD();
		int id = BancoDeDados.getLastIdUsuarioBD(usuarioBD);
		Usuario usuario = new Usuario();
		BancoDeDados.addUsuarioBD(usuarioBD, usuario);
		return usuarioBD;
	}
	
	public ArrayList<Usuario> excluir(ArrayList<Usuario> usuarioBD,Usuario usuario) {
		usuarioBD.remove(usuario.getId());
		return usuarioBD;
	}
	
	public void consultarPerfil() {
		System.out.printf("CPF: \n",this.getCpf());
		System.out.printf("NOME: \n",this.getNome());
		System.out.printf("IDADE: \n",this.getIdade());
		System.out.printf("ENDERECO: \n",this.getEndereco());
		System.out.printf("TELEFONE: \n",this.getTelefone());
		System.out.printf("CEP: \n",this.getCep());
	}
	
	public void editarPerfil() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("CPF: \n");
		this.setCpf(sc.nextInt());
		
		System.out.printf("NOME: \n");
		this.setNome(sc.next());
		System.out.printf("IDADE: \n");
		this.setCpf(sc.nextInt());
		System.out.printf("ENDERECO: \n");
		this.setEndereco(sc.next());
		System.out.printf("TELEFONE: \n");
		this.setTelefone(sc.nextInt());
		System.out.printf("CEP: \n");
		this.setCep(sc.nextInt());
		sc.close();
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