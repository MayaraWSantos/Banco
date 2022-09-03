
public class Conta {
	 private double saldo;
	 private int agencia;
	 private int conta;
	 Cliente titular;

public void deposita(double valor) {
	this.saldo = this.saldo+valor;
		
	}
public  boolean  saca(double valor) {
	     if(this.saldo>= valor) {
          this.saldo = this.saldo - valor;
          return true;
}
	return false;
}
	     public boolean transfere (double valor,Conta destino){
			if(this.saldo >= valor) {
				this.saldo= this.saldo-valor;
				destino.deposita( valor);
			     return true;
		}
		return false;
	}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getConta() {
			return conta;
		}
		public void setConta(int conta) {
			this.conta = conta;
		}
		public Cliente getTitular() {
			return titular;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

}