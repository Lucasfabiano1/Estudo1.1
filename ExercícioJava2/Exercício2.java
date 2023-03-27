package ExercícioJava2;

import java.util.Scanner;

public class Exercício2 {
    Scanner sc = new Scanner(System.in);

    // 1- Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for
    // maior que 10, caso contrário
    // escrever NÃO É MAIOR QUE 10!
    public void Exercício1() {
        System.out.println("Insira um valor númerico");
        double valorN = sc.nextDouble();
        if (valorN > 10) {
            System.out.println(valorN + " É MAIOR QUE 10!");
        } else {
            System.out.println(valorN + " NÃO É MAIOR QUE 10!");
        }
    }

    // 2- A jornada de trabalho semanal de um funcionário é de 40 horas. O
    // funcionário que trabalhar mais de 40 horas receberá hora extra, cujo
    // cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um
    // algoritmo que leia o número de horas trabalhadas em um mês,
    // o salário por hora e escreva o salário total do funcionário, que deverá ser
    // acrescido das horas extras, caso tenham sido
    // trabalhadas (considere que o mês possua 5 semanas exatas 5x40 = 200 horas
    // mês).
    public void Exercício2() {

    }

    // 3- Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
    // empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
    // vendas
    // até R$ 2.500,00 mais 5% sobre o que ultrapassar este valor, calcular e
    // escrever o seu salário total.
    public void Exercício3() {
        System.out.println("Insira o valor do seu salario fixo");
        double salFixo = sc.nextDouble();
        System.out.println("Insira o valor total das suas vendas");
        double valVendas = sc.nextDouble();
        double tres = salFixo + valVendas * 3 / 100;
        double cinco = salFixo + valVendas * 5 / 100;
        if (valVendas <= 2500) {
            System.out.println("Seu salário total é de R$ " + tres);
        } else if (valVendas >= 2500) {
            System.out.println("Seu salário total é de R$ " + cinco);
        }
    }

    // 4- Faça um algoritmo para ler: número da conta do cliente, saldo, débito e
    // crédito. Após, calcular e escrever o saldo atual
    // (saldo atual = saldo - débito + crédito). Também testar se saldo atual for
    // maior ou igual a zero escrever a mensagem
    // 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
    public void Exercício4() {
        System.out.println("Digite o valor do seu saldo");
        double saldo = sc.nextDouble();
        System.out.println("Digite o valor do seu débito");
        double débito = sc.nextDouble();
        System.out.println("Digite o valor do seu crédito");
        double crédito = sc.nextDouble();
        double saldoAtual = saldo - débito + crédito;
        if (saldoAtual > 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }

    // 7- Faça um algoritmo para ler: a descrição do produto (nome), a quantidade
    // adquirida e o preço unitário. Calcular
    // e escrever o total (total = quantidade adquirida * preço unitário), o
    // desconto e o total a pagar
    // (total a pagar = total - desconto), sabendo-se que:
    // - Se quantidade <= 5 o desconto será de 2%
    // - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
    // - Se quantidade > 10 o desconto será de 5%
    public void Exercício7() {
        System.out.println("informe o valor de uma paçoca");
        double precoPacoca = sc.nextInt();
        System.out.println("informe a quantia de paçocas compradas");
        int quantPacoca = sc.nextInt();
        double total = quantPacoca*precoPacoca;
        if(quantPacoca<=5){
        System.out.println("Pague R$" + total*2/100);
        } 
        if (quantPacoca>5 && quantPacoca<=10){
            System.out.println("Pague R$"+ total*3/100);
        }
        if(quantPacoca>10) {
            System.out.println("Pague R$" + total*5/100);
        }
    }
}

// desconto2 = quantPacoca*2/100