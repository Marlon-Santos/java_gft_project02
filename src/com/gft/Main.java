package com.gft;

import java.util.Scanner;

public class Main {

	private static Veiculo cm = new Caminhao();
	private static Veiculo av = new Aviao();
	private static Veiculo car = new Carro();
	private static Scanner sc = new Scanner(System.in);

	public static void loop() {
		System.out.println("1-ligar");
		System.out.println("2-acelerar");
		System.out.println("3-frear");
		System.out.println("4-abastecer");
		System.out.println("5-desligar");
		System.out.println("6-pintar");
		int escolha;
		escolha = sc.nextInt();
		validacao(escolha, car);
	}

	public static void validacao(int num, Veiculo vc) {
		int litros = 0;
		String cor;
		switch (num) {
		case 1:
			vc.ligar();
			break;
		case 2:
			vc.acelerar();
			break;
		case 3:
			vc.frear();
			break;
		case 4:
			System.out.println("qual a quantidade que deseja abastecer?");
			litros = sc.nextInt();
			vc.abastecer(litros);
			break;
		case 5:
			vc.desligar();
			break;
		case 6:
			System.out.printf("qual a cor que deseja pintar, cor atual: %s%n", car.getCor());
			cor = sc.nextLine();
			car.pintar(cor);
			break;
		default:
			System.out.println("valor invalido");
			break;
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("qual a marca do seu veiculo?");
			car.setMarca(sc.nextLine());
			System.out.println("qual � o modelo do seu veiculo");
			car.setModelo(sc.nextLine());
			System.out.println("qual � a placa do seu veiculo");
			car.setPlaca(sc.nextLine());
			System.out.println("qual � a cor do seu veiculo");
			car.setCor(sc.nextLine());
			System.out.println("cadastro realizado com sucesso, agora fa�a uma a��o:");
			while (true) {
				loop();
			}
		} catch (Exception e) {
			System.out.println("valor invalido");
			System.out.println("fa�a uma a��o valida:");
			loop();
		}
	}
}