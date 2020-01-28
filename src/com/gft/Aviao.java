package com.gft;

public class Aviao extends Veiculo {
    public Aviao() {
        super();
    }

    public void abastecer(String qtdLitros) {
        super.abastecer(Integer.parseInt(qtdLitros));
    }

    @Override
    public void acelerar() {
        if (this.getIsLigado()) {
            if (this.getLitrosCombustivel() >= 1) {
                this.setVelocidade(getVelocidade() + 100);
                this.setLitrosCombustivel(getLitrosCombustivel() - 10);

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