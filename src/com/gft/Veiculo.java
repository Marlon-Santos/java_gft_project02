package com.gft;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km = 0;
	private boolean isLigado = false;
	private int litrosCombustivel = 0;
	private int velocidade = 0;
	private double preco = 0.0;

	public void acelerar() {
		if (this.getIsLigado()) {
			if (litrosCombustivel >= 1) {
				this.velocidade += 20;
				this.litrosCombustivel -= 1;
				System.out.printf("carro em movimento, Velocidade: %dkm/h", this.velocidade);
				System.out.printf(" combustivel: %dL%n", this.litrosCombustivel);
			} else {
				System.out.println("abastecer primeiro, voce esta sem gasolina");
			}

		} else {
			System.out.println("não é possivel acelerar pois o carro esta desligado, por favor ligue-o primeiro");
		}
	}

	public void abastecer(int qtdLitros) {
		if (this.litrosCombustivel + qtdLitros <= 100) {
			this.litrosCombustivel += qtdLitros;
			System.out.printf("carro abastecido, quantidade atual: %dL%n", this.litrosCombustivel);
		} else {
			System.out.println("voce esta ultrapassando o limite de 100L, por favor coloque um valor dentro do limite");
		}
	}

	public void frear() {
		if (this.isLigado && this.velocidade > 0) {
			if (this.velocidade <= 10) {
				this.velocidade = 0;
				System.out.println("carro freiado e parado");
			} else {
				this.velocidade -= 10;
				System.out.printf("carro freiado velocidade atual %d km/h", velocidade);
			}
		} else {
			System.out.println("voce esta parado");
		}
	}

	public void pintar(String cor) {
		if (cor.trim() != this.cor.trim()) {
			this.cor = cor;
			System.out.printf("cor alterada, cor atual: %s", this.cor);
		} else {
			System.out.println("cor não modificado, cor escolhida não disponivel");
		}

	}

	public void ligar() {
		if (this.isLigado) {
			System.out.println("o carro ja se encontra ligado");
		} else {
			this.isLigado = true;
			System.out.println("o carro foi ligado");
		}
	}

	public void desligar() {
		if (!this.isLigado) {
			System.out.println("o carro ja se encontra desligado");
		} else {
			this.isLigado = false;
			System.out.println("o carro foi desligado");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean getIsLigado() {
		return isLigado;
	}

	public void setIsLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
