package livrariadigital;
import java.util.ArrayList;

public class BancoDeDados {
	private ArrayList<Genero> generoBD = new ArrayList<Genero>();
	private ArrayList<Livro> livroBD = new ArrayList<Livro>();
	private ArrayList<Editora> editoraBD = new ArrayList<Editora>();
	private ArrayList<Autor> autorBD = new ArrayList<Autor>();
	
	public ArrayList<Usuario> createUsuarioBD() {
		ArrayList< Usuario > usuarioBD= new ArrayList< Usuario >() ;
		return usuarioBD;
	}
	public ArrayList<Usuario> addUsuarioBD(ArrayList<Usuario> usuarioBD, Usuario usuario) {
		usuarioBD.add(usuario);
		return usuarioBD;
	}
	public ArrayList<Usuario> removeUsuarioBD(ArrayList<Usuario> usuarioBD, int id) {
		usuarioBD.remove(id);
		return usuarioBD;
	}
	public int getLastIdUsuarioBD(ArrayList<Usuario> usuarioBD) {
		int id;
		id = usuarioBD.size()-1;
		return id;
	}
	public void clearUsuarioBD(ArrayList<Usuario> usuarioBD) {
		usuarioBD.clear();
	}
	
	
	public ArrayList<Genero> getGeneroBD() {
		return generoBD;
	}
	public void setGeneroBD(ArrayList<Genero> generoBD) {
		this.generoBD = generoBD;
	}
	public ArrayList<Livro> getLivroBD() {
		return livroBD;
	}
	public void setLivroBD(ArrayList<Livro> livroBD) {
		this.livroBD = livroBD;
	}
	public ArrayList<Editora> getEditoraBD() {
		return editoraBD;
	}
	public void setEditoraBD(ArrayList<Editora> editoraBD) {
		this.editoraBD = editoraBD;
	}
	public ArrayList<Autor> getAutorBD() {
		return autorBD;
	}
	public void setAutorBD(ArrayList<Autor> autorBD) {
		this.autorBD = autorBD;
	}
	
	
}
