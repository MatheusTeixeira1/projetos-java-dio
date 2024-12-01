import java.util.Scanner;

public class Contador {
    static Scanner terminal = new Scanner(System.in);
    static int parametroUm;
    static int parametroDois;
    public static void main(String[] args) throws Exception {

        do{
            pegarImputs();
            try{
                contar(parametroUm, parametroDois);
                break;
            }catch (ParametrosInvalidosException e){
                System.err.println("O primeiro parâmetro não pode ser maior que o segundo!");
            }

        }while(true);
        terminal.close();
    }


    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            for(int i = 1;i<=(parametroDois-parametroUm);i++){
                System.out.println("Imprimindo numero: " + i);
            }
        }
	}

    static void pegarImputs(){
		System.out.println("Digite o primeiro parâmetro");
		parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		parametroDois = terminal.nextInt();
    }
}
