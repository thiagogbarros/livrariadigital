package livrariadigital;
import java.util.ArrayList;

public class BancoDeDados {
	private ArrayList< Usuario > usuarioBD= new ArrayList< Usuario >() ;
	private ArrayList<Genero> generoBD = new ArrayList<Genero>();
	private ArrayList<Livro> livroBD = new ArrayList<Livro>();
	private ArrayList<Editora> editoraBD = new ArrayList<Editora>();
	private ArrayList<Autor> autorBD = new ArrayList<Autor>();
	
	public ArrayList<Usuario> getUsuarioBD() {
		return usuarioBD;
	}
	public void setUsuarioBD(ArrayList<Usuario> usuarioBD) {
		this.usuarioBD = usuarioBD;
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
