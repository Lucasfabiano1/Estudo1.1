import java.util.Scanner;

public class Exercício1 {
    Scanner sc = new Scanner(System.in);

    public void exercíciob() {
        System.out.println("Insira a nota referente ao 1°semestre");
        double Nota1 = sc.nextDouble();
        System.out.println("Insira a nota referente ao 2°semestre");
        double Nota2 = sc.nextDouble();
        double NotaFinal = Nota1 + Nota2;
        if (NotaFinal < 60) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }
    }

    // 1. Escreva um programa para ler 2 valores (considere que não serão informados
    // valores iguais) e escrever o maior deles.
    public void exercício1() {
        System.out.println("Insira o valor A");
        double valorA = sc.nextDouble();
        System.out.println("Insira o valor B");
        double valorB = sc.nextDouble();
        System.out.println("Insira o valor C");
        double valorC = sc.nextDouble();
        if (valorA > valorB && valorA > valorC) {
            System.out.println("O maior valor é A " + valorA);
        }
        if (valorB > valorA && valorB > valorC) {
            System.out.println("O maior valor é B " + valorB);
        }
        if (valorC > valorA && valorC > valorB) {
            System.out.println("O maior valor é C " + valorC);
        }
    }

    // 2. Escreva um programa para ler o ano de nascimento de uma pessoa e
    // escrever uma mensagem que diga se ela poderáou não votar este ano (nãoé
    // necessárioconsiderar o mês em que ela nasceu).
    public void exercício2() {
        System.out.println("Escreva seu ano de nascimento");
        int anonasc = sc.nextInt();
        if(anonasc>=2007){
        System.out.println("Você não pode votar");
    } else {
        System.out.println("Você pode votar");
    } 
}
// 3. Escreva um programa que verifique a validade de uma senha fornecida pelo
// usuário. A senha válida é o número 1234. Devem ser impressas as seguintes
// mensagens:
// ACESSO PERMITIDO caso a senha seja válida.
// ACESSO NEGADO caso a senha seja inválida.
public void exercício3(){
    System.out.println("Digite a senha:");
    int senha = sc.nextInt();
    if (senha==1234) {
        System.out.println("BEM VINDO");
    } else{
        System.out.println("TENTE NOVAMENTE");
    }
}
// 4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
// e R$0,25 se forem compradas pelo menos doze. Escreva um programa que leia
// o número de maçãs compradas, calcule e escreva o valor total dacompra.
public void exercício4(){
    System.out.println("Digite a quantia de macas");
    int macas = sc.nextInt();
     if (macas>12){
        System.out.println("O valor total da compra foi de R$ "+ macas*0.25);
     } else{
        System.out.println("O valor total da compra foi de R$ "+ macas*0.30);
     }

    }
//     5. Escreva um programa para ler 3 valores inteiros (considere que não serão
// lidos valores iguais) e escrevê-los em ordem crescente.
    public void exercício5(){
        System.out.println("Digite o primeiro número");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número");
        double num3 = sc.nextDouble();
        if (num1>num2 && num2>num3){
            System.out.println("A ordem será o "+ num1 + " Em primeiro lugar, " +num2+ " Em segundo lugar e " + num3+ " Em terceiro lugar" );
        }
        if (num1>num3 && num3>num2){
            System.out.println("A ordem será o "+ num1 + " Em primeiro lugar, " +num3+ " Em segundo lugar e " + num2+ " Em terceiro lugar" );
        }
        if (num2>num1 && num1>num3){
            System.out.println("A ordem será o "+ num2 + " Em primeiro lugar, " +num1+ " Em segundo lugar e " + num3+ " Em terceiro lugar" );
        }
        if (num2>num3 && num1>num1){
            System.out.println("A ordem será o "+ num2 + " Em primeiro lugar, " +num3+ " Em segundo lugar e " + num1+ " Em terceiro lugar" );
        }
        if (num3>num1 && num1>num2){
            System.out.println("A ordem será o "+ num3 + " Em primeiro lugar, " +num1+ " Em segundo lugar e " + num2+ " Em terceiro lugar" );
        }
        if (num3>num2 && num2>num1){
            System.out.println("A ordem será o "+ num3 + " Em primeiro lugar, " +num2+ " Em segundo lugar e " + num1+ " Em terceiro lugar" );
        }


    }
//     6. Tendo como entrada a altura e o sexo (codificado da seguinte forma:
// 1:feminino; 2:masculino) de uma pessoa, construa um programa que calcule e
// imprima seu peso ideal, utilizando as seguintes.
// Fórmulas:
// - para homens: (72.7*Altura)– 58;
// - para mulheres: (62.1*Altura)– 44.7;
    public void exercício6(){
        System.out.println("Digite sua altura");
        double alt = sc.nextDouble();
        System.out.println("Selecione seu sexo 1 (feminino) e 2 (masculino)");
        int sexo= sc.nextInt();  
        if(sexo==1) {
            System.out.println("Seu peso ideal é " + (62.1*alt-44.7) + "kg" );
        }else {
            System.out.println("Seu peso ideal é " + (72.7*alt-58) + "kg");
        }
       
    }
    public void exercício1Ex() {
        System.out.println("Digite um numero");
        int n = sc.nextInt();
        if (n % 2==0){
            System.out.println("seu numero é par");
        } else{
            System.out.println("seu numero é impar");
        }
    }
//     2- Desafio 1: Crie um programa que recebe uma nota ( pela classe Scanner) e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria.
// A regra é a seguinte:
// Nota 7 ou mais: passou direto
// Entre 5 e 7: têm direito de fazer uma prova de recuperação
// Abaixo de 5: reprovado direto
    public void exercício2Ex() {
        System.out.println("Insira sua nota");
        double notaEx = sc.nextDouble();
        if (notaEx >= 7){
            System.out.println("Aprovado");
        }
        if (notaEx>=5 && notaEx <7){
            System.out.println("Tem direito a recuperação");
        }
        if (notaEx<5){
            System.out.println("reprovado direto");
        }
    } 
// 3- Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.

    public void exercício3Ex() {
        System.out.println("Digite uma letra");
       String Letra = sc.nextLine();
       String tipoLetra ="";
       switch (Letra){
        case "a": tipoLetra= "vogal";
        break;
        case "e": tipoLetra= "vogal";
        break;
        case "i": tipoLetra= "vogal";
        break;
        case "o": tipoLetra= "vogal";
        break;
        case "u": tipoLetra= "vogal";
        break;
        default: tipoLetra= "Consoante";
        break;
       }
       System.out.println(Letra +" é uma "+tipoLetra );
        
    }
    // Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  uma variável inteira), imprima cada um dos seus dígitos por extenso.
    public void exercícioGo(){
        System.out.println("Digite um valor númerico");
        int valor = sc.nextInt();
        String nomeNum = "";
        switch (valor) {
            case 0: nomeNum = "zero";
            break;
            case 1: nomeNum = "Um";
            break;
            case 2: nomeNum = "segundo";
            break;
            case 3: nomeNum = "três";
            break;
            case 4: nomeNum = "quatro";
            break;
            case 5: nomeNum = "cinco";
            break;
            case 6: nomeNum = "seis";
            break;
            case 7: nomeNum = "sete";
            break;
            case 8: nomeNum = "oito";
            break;
            case 9: nomeNum = "nove";
            break;
        }
        System.out.println("seu número é o "+nomeNum);
        }
        // 4- Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        // -Salários até R$ 1280,00 (incluindo): aumento de 20%;
        // -Salários entre R$ 1280,00 e R$1700,00: aumento de 15%;
        // -Salários entre R$ 1700,00 e R$ 2500,00: aumento de 10%;
        // -Salários de R$ 2500,00 em diante: aumento de 5% 
        
        // Após o aumento ser realizado; informe na tela:
        // *O salário antes do reajuste;
        // *O percentual de aumento aplicado;
        // *O valor do aumento;
        // *O novo salário, após o aumento.  
        public void exercício4Ex() {
            System.out.println("Digite um valor");
            double valor = sc.nextDouble();
            if(valor>=0){
                System.out.println("Seu número " + valor+ " é positivo");
            } else {
                System.out.println("Seu número "+valor+" é negativo" );
            }
        }
        // 8- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.  
        public void exercício5Ex() {
            System.out.println("Insira o preço do primeiro produto");
            double produto1 = sc.nextDouble();
            System.out.println("Insira o preço do segundo produto");
            double produto2 = sc.nextDouble();
            System.out.println("Insira o preço do terceiro produto");
            double produto3 = sc.nextDouble();
            if(produto1<produto2 && produto1<produto3){
                System.out.println("compre o primeiro produto R$ " + produto1);
            }
            if(produto2<produto1 && produto2<produto3){
                System.out.println("compre o segundo produto R$ " + produto2);
            }
            if(produto3<produto1 && produto3<produto2){
                System.out.println("compre o terceiro produto R$ " + produto3);
            }
            
        }

}
