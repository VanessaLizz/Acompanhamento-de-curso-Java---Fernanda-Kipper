package java_curso;

public class Carro {
    String modelo;

    public static void main(String[] args) {
        System.out.println("teste");
    }

    public Carro (String modelo) {
        this.modelo = modelo;
    }
}

// public -> acessível de todo lugar
//default -> utilização padrão quando ñ há definição
//private -> acessível somente dentro da classe que foi definido
//protected - > acessível por todos do mesmo pacote