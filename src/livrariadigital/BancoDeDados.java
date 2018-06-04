package livrariadigital;
import java.util.ArrayList;

public class BancoDeDados {
	
	public static ArrayList<Livro> createLivroBD() {
		ArrayList< Livro > livroBD= new ArrayList< Livro >() ;
		return livroBD;
	}
	public static ArrayList<Livro> addLivroBD(ArrayList<Livro> livroBD, Livro livro) {
		livroBD.add(livro);
		return livroBD;
	}
	public static ArrayList<Livro> removeLivroBD(ArrayList<Livro> livroBD, int id) {
		livroBD.remove(id);
		return livroBD;
	}
	public static int getLastIdLivroBD(ArrayList<Livro> livroBD) {
		int id;
		id = livroBD.size()-1;
		return id;
	}
	public static void clearLivroBD(ArrayList<Livro> livroBD) {
		livroBD.clear();
	}
	
	
	public static ArrayList<Genero> createGeneroBD() {
		ArrayList< Genero > generoBD= new ArrayList< Genero >() ;
		return generoBD;
	}
	public static ArrayList<Genero> addGeneroBD(ArrayList<Genero> generoBD, Genero genero) {
		generoBD.add(genero);
		return generoBD;
	}
	public static ArrayList<Genero> removeGeneroBD(ArrayList<Genero> generoBD, int id) {
		generoBD.remove(id);
		return generoBD;
	}
	public static int getLastIdGeneroBD(ArrayList<Genero> generoBD) {
		int id;
		id = generoBD.size()-1;
		return id;
	}
	public static void clearGeneroBD(ArrayList<Genero> generoBD) {
		generoBD.clear();
	}
	
	public static ArrayList<Usuario> createUsuarioBD() {
		ArrayList< Usuario > usuarioBD= new ArrayList< Usuario >() ;
		return usuarioBD;
	}
	public static ArrayList<Usuario> addUsuarioBD(ArrayList<Usuario> usuarioBD, Usuario usuario) {
		usuarioBD.add(usuario);
		return usuarioBD;
	}
	public static ArrayList<Usuario> removeUsuarioBD(ArrayList<Usuario> usuarioBD, int id) {
		usuarioBD.remove(id);
		return usuarioBD;
	}
	public static int getLastIdUsuarioBD(ArrayList<Usuario> usuarioBD) {
		int id;
		id = usuarioBD.size()-1;
		return id;
	}
	public static void clearUsuarioBD(ArrayList<Usuario> usuarioBD) {
		usuarioBD.clear();
	}
	
	public static ArrayList<Editora> createEditoraBD() {
		ArrayList< Editora > editoraBD= new ArrayList< Editora >() ;
		return editoraBD;
	}
	public static ArrayList<Editora> addEditoraBD(ArrayList<Editora> editoraBD, Editora Editora) {
		editoraBD.add(Editora);
		return editoraBD;
	}
	public static ArrayList<Editora> removeEditoraBD(ArrayList<Editora> editoraBD, int id) {
		editoraBD.remove(id);
		return editoraBD;
	}
	public static int getLastIdEditoraBD(ArrayList<Editora> editoraBD) {
		int id;
		id = editoraBD.size()-1;
		return id;
	}
	public static void clearEditoraBD(ArrayList<Editora> editoraBD) {
		editoraBD.clear();
	}
	
	public static ArrayList<Autor> createAutorBD() {
		ArrayList< Autor > autorBD= new ArrayList< Autor >() ;
		return autorBD;
	}
	public static ArrayList<Autor> addAutorBD(ArrayList<Autor> autorBD, Autor Autor) {
		autorBD.add(Autor);
		return autorBD;
	}
	public static ArrayList<Autor> removeAutorBD(ArrayList<Autor> autorBD, int id) {
		autorBD.remove(id);
		return autorBD;
	}
	public static int getLastIdAutorBD(ArrayList<Autor> autorBD) {
		int id;
		id = autorBD.size()-1;
		return id;
	}
	public static void clearAutorBD(ArrayList<Autor> autorBD) {
		autorBD.clear();
	}
	
}
