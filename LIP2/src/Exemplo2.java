/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauricio.moreira
 */
class Veiculo {
    public void acelerar() {
        System.out.println("Veiculo acelerando...");
    }
    public void frear() {
        System.out.println("Veiculo freando...");
    }
}

class Bicicleta extends Veiculo {
    @Override
    public void frear() {
        System.out.println("Bicicleta freando...");
    }
    public void pedalar() {
        System.out.println("Pedalando...");
    }
}

public class Exemplo2 {
    public static void main(String[] args) {
        Veiculo v1 = new Bicicleta();
        Bicicleta b;
        b = (Bicicleta) v1;
        b.pedalar();
    }
}
