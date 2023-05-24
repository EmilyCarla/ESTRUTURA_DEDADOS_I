import java.util.Stack;
import java.util.Random;

public class Sorteio{
    public static void main(String[] args) {
        
        Random numerosAleatorios = new Random();
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        for(int i=0; i<100; i++){
            int numeroSorteado = numerosAleatorios.nextInt(9)+1;//gera numeros entre 1 e 9
            if(numeroSorteado>=1 && numeroSorteado<=3){
                pilha1.push(numeroSorteado);
            }else if(numeroSorteado>=4 && numeroSorteado<=6){
                pilha2.push(numeroSorteado);
            }else if(numeroSorteado>=7 && numeroSorteado<=9){
                pilha3.push(numeroSorteado);
            }
        }

        for(int i=0; i<100; i++){
            int numeroSorteado = numerosAleatorios.nextInt(3)+1;//gera numeros entre 1 e 3
            Stack<Integer> pilhaSaida;
            Stack<Integer> pilhaDestino;

            if(numeroSorteado == 1){
                pilhaSaida = pilha2;
                pilhaDestino = pilha1;
            }else if(numeroSorteado == 2){
                pilhaSaida = pilha3;
                pilhaDestino = pilha2;
            }else{
                pilhaSaida = pilha1;
                pilhaDestino = pilha3;
            }

            if(!pilhaSaida.isEmpty()){
                int numeroMudado = pilhaSaida.pop();
                pilhaDestino.push(numeroMudado);
            }

            if(pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()){
                break;
            }
        }

        System.out.println("Pilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);
    }
}