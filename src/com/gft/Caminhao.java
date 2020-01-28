package com.gft;

public class Caminhao extends Veiculo {
    public Caminhao() {
        super();
    }

    public void abastecer(float qtdLitros) {
        super.abastecer((int) qtdLitros);
    }

    @Override
    public void acelerar() {
        if (this.getIsLigado()) {
            if (this.getLitrosCombustivel() >= 1) {
                this.setVelocidade(getVelocidade() + 50);
                this.setLitrosCombustivel(getLitrosCombustivel() - 30);

                System.out.printf("veiculo em movimento, Velocidade: %dkm/h", this.getVelocidade());
                System.out.printf(" combustivel: %dL%n", this.getLitrosCombustivel());
            } else {
                System.out.println("abastecer primeiro, voce esta sem gasolina");
            }

        } else {
            System.out.println("n�o � possivel acelerar pois o veiculo esta desligado, por favor ligue-o primeiro");
        }
    }
}