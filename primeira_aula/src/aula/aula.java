package aula;

public class aula {
	public double base, altura, area;
	
	public double calcArea() {
		area = base * altura;
		return area;
	}
		public void result() {
			calcArea();
			System.out.println("A area do retangulo e: " + area);		
	}
}
