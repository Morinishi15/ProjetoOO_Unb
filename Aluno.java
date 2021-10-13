
public class Aluno {
	private String nomeAluno;
	private String emailAluno;
	private int totalDeRendimentoAluno;
	
	public void cadastrar(String nomeAluno, String emailAluno, int totalDeRendimentos) {
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.totalDeRendimentoAluno = totalDeRendimentos;
	}
	
	public void mostrar(String nomeAluno, String emailAluno, int totalDeRendimentos) {
		System.out.println("Nome "+nomeAluno);
		System.out.println("Email "+emailAluno);
		System.out.println("Rendimentos"+totalDeRendimentos);
		
	}
}

