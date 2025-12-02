import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Vanessa");
        nomes.add("Pedro");
        nomes.add("João");
        nomes.add("Catarina");

        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes){
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Está na contagem");
            contador++;

        }
    }
}


class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }
}