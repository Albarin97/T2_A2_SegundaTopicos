package edu.tecjerez.topicos.figuras;

public class Triangulo {
	//metodo que calcule el area de un triangulo por la formula de heron
	public double trianguloHeron(double a, double b,double c) {
		double s=((a+b+c)/2);
		return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}
