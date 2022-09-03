
public class TestaConta {

	public static void main(String[] args) {
		Cliente p = new Cliente("Paulo Silveira","05736979402","Programador");
		
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		contaDoPaulo.titular =  p;
		 
		System.out.println(contaDoPaulo.titular.getNome());
	}
	

}
