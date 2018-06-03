
public class Usuario {
	int cpf;
	String nome;
	int idade;
	String endereco;
	int telefone;
	int cep;

	Usuario criar() {
		Usuario x = new Usuario();	
		return x;
	}
	
	void excluir(Usuario x) {
		x = null;	//nao haverá referencia para o objeto, logo sera deletado pelo garbage collector.
	}
	
	void consultar(Usuario x) {
		System.out.printf("CPF: \n",x.cpf);
		System.out.printf("NOME: \n",x.nome);
		System.out.printf("IDADE: \n",x.idade);
		System.out.printf("ENDERECO: \n",x.endereco);
		System.out.printf("TELEFONE: \n",x.telefone);
		System.out.printf("CEP: \n",x.cep);
	}
}

