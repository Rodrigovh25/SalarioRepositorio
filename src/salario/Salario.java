package salario;

public class Salario {
	private int salarioBase = 20000;
    private int antiguedad;
    private int plus;
    
    public Salario(int antiguedad, int plus){
        this.antiguedad = antiguedad;
        this.plus = plus;
    }
    
    public int calcularSalarioFinal() {
      int res = 0;
      if (this.antiguedad > 3)
        res = this.salarioBase + this.antiguedad * 1000 + this.plus;
      else
        if (this.plus <= 1000)
         res = this.salarioBase + this.plus * 2;
        else
         res = this.salarioBase + this.plus; 
      return res;
    }
}
