package JavaPOO001.comparacao;

import java.util.Objects;

public class Carro {
    String cor, marcar, modelo;
     Carro(String cor, String marca, String modelo){
         this.cor = cor;
         this.marcar = marca;
         this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(cor, carro.cor) && Objects.equals(marcar, carro.marcar) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marcar, modelo);
    }
}
