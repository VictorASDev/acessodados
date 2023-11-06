package app;

public class App {

	public static void main(String[] args) {
		CursoDAO cursoDAO = new CursoDAO();
		
		Curso curso = new Curso();
		
		curso.setNome("Clojure");
		
		cursoDAO.incluir( curso);
		
		curso = null;

		
		Curso cursoex = new Curso();
		
		cursoex.setNome("Clojure");
		
		
		
		cursoex.setId(41);
		
		cursoDAO.excluir(cursoex);
		
		
		
		// TODO Auto-generated method stub

	}

}
