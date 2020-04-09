package br.com.prova.model;

public class Triangulo {

	private Integer lado1;
	private Integer lado2;
	private Integer lado3;

	public Triangulo() {
	}

	public Triangulo(Integer lado1, Integer lado2, Integer lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Integer getLado1() {
		return lado1;
	}

	public void setLado1(Integer lado1) {
		this.lado1 = lado1;
	}

	public Integer getLado2() {
		return lado2;
	}

	public void setLado2(Integer lado2) {
		this.lado2 = lado2;
	}

	public Integer getLado3() {
		return lado3;
	}

	public void setLado3(Integer lado3) {
		this.lado3 = lado3;
	}

	public String tipoTriangulo() {
		if (this.eTriangulo()) {
			if (lado1 == lado2 && lado2 == lado3) {
				return "Triangulo Equilatero";
			} else if (lado1 == lado2 || lado2 == lado3) {
				return "Triangulo Isosceles";
			} else {
				return "Triangulo Escaleno";
			}
		} else {
			return "Não é triangulo";
		}

	}

	public boolean eTriangulo() {
		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado2 + lado1)) {
			return true;
		}
		return false;
	}


}
