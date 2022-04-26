
package identificandotriangulos;
import java.util.Scanner;
/*
Elaborar um programa que aponte que tipo de triângulo corresponde os dados de entrada do usuário, sabendo-se que:
Triângulo Escaleno – Lados e ângulos são diferentes
Triângulo Isósceles – Dois lados iguais e ângulos opostos a esses lados iguais
Triângulo Equilátero – Lados e ângulos iguais
*/

public class IdentificandoTriangulos {
    

    public static void main(String[] args) {
        /*int diaNasc,mesNasc,anoNasc,idade;
        int anoAtual=2022;
        int lado1, lado2, lado3;
        int opcao = 1;

        while (opcao == 1) {
            Scanner s = new Scanner(System.in);

            System.out.println("dia: ");
            diaNasc = s.nextInt();
            System.out.println("------------------------------------------------");
            System.out.println("mes: ");
            mesNasc = s.nextInt();
            System.out.println("------------------------------------------------");
            System.out.println("ano: ");
            anoNasc = s.nextInt();
            System.out.println("------------------------------------------------");
            
            System.out.println("Data de nascimento:"+diaNasc+"/"+mesNasc+"/"+anoNasc);
            idade = anoAtual - anoNasc;
            System.out.println("Você tem: "+idade+" anos");
            /*          
            if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("Triangulo Equilatero");
                } else if ((lado1 == lado2) || (lado1 == lado3)) {
                    System.out.println("Triangulo Isosceles");
                } else
                    System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Não é um triangulo!");
            }
            System.out.println("------------------------------------------------");
            System.out.println("Deseja continuar? 1 = sim, 2 = não");
            opcao = s.nextInt();
            System.out.println("------------------------------------------------");
        }

        System.out.println("Tchau!");*/
        Scanner s = new Scanner(System.in);
        int L1 = 0;
        int L2 = 0;
        int L3 = 0;
        int opcao=1;
        
        while(opcao == 1){
      
            System.out.println("Digite um valor numérico para L1: ");
            try{
                L1 = s.nextInt();
            }
           catch(NullPointerException e)
            {
                System.out.println("Dados invalidos");
                L1 = s.nextInt();
            }
            System.out.println("------------------------------------------------");
            System.out.println("Digite um valor numérico para L2: ");
            L2 = s.nextInt();
            System.out.println("------------------------------------------------");
            System.out.println("Digite um valor numérico para L3: ");
            L3 = s.nextInt();
            System.out.println("------------------------------------------------");


            triangulo t1=new triangulo(L1,L2,L3);
            //triangulo t2=new triangulo(2,2,1);
           // triangulo t3=new triangulo(1,2,3);
            t1.showInfo();
            t1.testTriangle();
            //t2.showInfo();
            //t2.testTriangle();
           // t3.showInfo();
            //t3.testTriangle();
            
            System.out.println("------------------------------------------------");
            System.out.println("Deseja continuar? 1 = sim, 2 = não");
            opcao = s.nextInt();
            System.out.println("------------------------------------------------");
        }
    } 
}
