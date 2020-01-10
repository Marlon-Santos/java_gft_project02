package com.gft;

import java.util.Scanner;

public class Main {

	private static Veiculo car = new Veiculo();
	private static Scanner sc = new Scanner(System.in);

	public static void loop() {
		int escolha;
		escolha = sc.nextInt();
		validacao(escolha);
	}

	public static void validacao(int num) {
		int litros = 0;
		String cor;
		switch (num) {
		case 1:
			car.ligar();
			break;
		case 2:
			car.acelerar();
			break;
		case 3:
			car.frear();
			break;
		case 4:
			System.out.println("qual a quantidade que deseja abastecer?");
				litros = sc.nextInt();
				car.abastecer(litros);
			break;
		case 5:
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
			System.out.println("qual a marca do seu carro?");
			car.setMarca(sc.nextLine());
			System.out.println("qual é o modelo do seu carro?");
			car.setModelo(sc.nextLine());
			System.out.println("qual é a placa do seu carro?");
			car.setPlaca(sc.nextLine());
			System.out.println("qual é a cor do seu carro?");
			car.setCor(sc.nextLine());

			System.out.println("cadastro realizado com sucesso, agora faça uma ação:");

			while (true) {
				loop();
			}
		} catch (Exception e) {
			System.out.println("valor invalido");
			System.out.println("faça uma ação valida:");
			loop();
		}
	}
}