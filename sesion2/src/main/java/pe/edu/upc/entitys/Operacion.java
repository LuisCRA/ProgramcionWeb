package pe.edu.upc.entitys;

import javax.print.attribute.standard.RequestingUserName;

public class Operacion {
	private char operacion;
	private double numeroA;
	private double numeroB;
	
	public Operacion()
	{
		super();
	}

	public char getS() {
		return operacion;
	}

	public void setS(char operacion) {
		this.operacion = operacion;
	}
	
	
	public double getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}

	public double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}

	//métodos de usuarios
	public double Calcular()
	{
		try
		{
			switch (this.operacion)
			{
			case '+':
				return this.numeroA+this.numeroB;				
				

			case '-':
				return this.numeroA-this.numeroB;	
				
			case '*':
				return this.numeroA*this.numeroB;	
				
			case '/':
				return this.numeroA/this.numeroB;		
			
			default:
				return 0;
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
