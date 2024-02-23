import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ativoPassivoOpcao = true;

        while (ativoPassivoOpcao) {
            try {
                System.out.println("1 - BP\n2 - DRE\nEscolha uma opcao: ");
                int opcao = scanner.nextInt();

                if (opcao == 1) {
                    
                    System.out.println("Voce escolheu Balanco Patrimonial");

                   
                    calcularBalancoPatrimonial();

                    ativoPassivoOpcao = false;
                } else if (opcao == 2) {
                 
                    System.out.println("Voce escolheu Demonstracao de Resultados do Exercicio (DRE)");

                    
                    calcularDemonstracaoResultados();

                    ativoPassivoOpcao = false;
                } else {
                    System.out.println("Opcao invalida. Por favor, escolha 1 ou 2.");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida. Por favor, insira um numero inteiro.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }
    }

    public static void calcularBalancoPatrimonial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo do Balanco Patrimonial:");

       
        Map<String, Double> ativo = new HashMap<>();
        double totalAtivo = 0.0;

        System.out.println("Digite a quantidade de contas do Ativo: ");
        int nAtivo = scanner.nextInt();

        for (int i = 0; i < nAtivo; i++) {
            System.out.println("Digite o nome da conta do Ativo: ");
            String nomeConta = scanner.next();

            System.out.println("Digite o valor da conta do Ativo: ");
            double valorConta = scanner.nextDouble();

            ativo.put(nomeConta, valorConta);
            totalAtivo += valorConta;
        }

       
        Map<String, Double> passivo = new HashMap<>();
        double totalPassivo = 0.0;

        System.out.println("Digite a quantidade de contas do Passivo: ");
        int nPassivo = scanner.nextInt();

        for (int i = 0; i < nPassivo; i++) {
            System.out.println("Digite o nome da conta do Passivo: ");
            String nomeConta = scanner.next();

            System.out.println("Digite o valor da conta do Passivo: ");
            double valorConta = scanner.nextDouble();

            passivo.put(nomeConta, valorConta);
            totalPassivo += valorConta;
        }

       
        Map<String, Double> patrimonioLiquido = new HashMap<>();
        double totalPatrimonioLiquido = 0.0;

        System.out.println("Digite a quantidade de contas do Patrimonio Liquido: ");
        int nPatrimonioLiquido = scanner.nextInt();

        for (int i = 0; i < nPatrimonioLiquido; i++) {
            System.out.println("Digite o nome da conta do Patrimonio Liquido: ");
            String nomeConta = scanner.next();

            System.out.println("Digite o valor da conta do Patrimonio Liquido: ");
            double valorConta = scanner.nextDouble();

            patrimonioLiquido.put(nomeConta, valorConta);
            totalPatrimonioLiquido += valorConta;
        }

       
        System.out.println("=====================");
        System.out.println("Balanco Patrimonial");
        System.out.println("=====================");
        System.out.println("Ativo:");

        for (Map.Entry<String, Double> entry : ativo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total Ativo: " + totalAtivo);

        System.out.println("Passivo:");

        for (Map.Entry<String, Double> entry : passivo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total Passivo: " + totalPassivo);

        System.out.println("Patrimonio Liquido:");

        for (Map.Entry<String, Double> entry : patrimonioLiquido.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total Patrimonio Liquido: " + totalPatrimonioLiquido);
        System.out.println("=====================");
    }

    public static void calcularDemonstracaoResultados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo da Demonstracao de Resultados do Exercicio (DRE):");

       
        System.out.println("Digite a Receita Operacional Bruta: ");
        double receitaOperacionalBruta = scanner.nextDouble();

      
        System.out.println("Digite as Vendas Canceladas: ");
        double vendasCanceladas = scanner.nextDouble();

        double receitaOperacionalLiquida = receitaOperacionalBruta - vendasCanceladas;

       
        System.out.println("Digite os Descontos: ");
        double descontos = scanner.nextDouble();

        double lucroBruto = receitaOperacionalLiquida - descontos;

       
        System.out.println("Digite o CMV: ");
        double CMV = scanner.nextDouble();

       
        System.out.println("Digite as Despesas de Vendas: ");
        double despesasDeVendas = scanner.nextDouble();

       
        System.out.println("Digite as Despesas Administrativas: ");
        double despesasAdministrativas = scanner.nextDouble();

        double lucroOperacional = lucroBruto - CMV - despesasDeVendas - despesasAdministrativas;

     
        System.out.println("Digite as Despesas Financeiras: ");
        double despesasFinanceiras = scanner.nextDouble();


        double lucroLiquidoAntesDoIR = lucroOperacional - despesasFinanceiras;

       
        System.out.println("Digite o IR: ");
        double IR = scanner.nextDouble();

      
        double lucroLiquido = lucroLiquidoAntesDoIR - IR;

        System.out.println("=====================");
        System.out.println("Demonstracao de Resultados do Exercicio (DRE)");
        System.out.println("=====================");
        System.out.println("Receita Operacional Bruta: " + receitaOperacionalBruta);
        System.out.println("Vendas Canceladas: " + vendasCanceladas);
        System.out.println("Receita Operacional Liquida: " + receitaOperacionalLiquida);
        System.out.println("Descontos: " + descontos);
        System.out.println("Lucro Bruto: " + lucroBruto);
        System.out.println("CMV: " + CMV);
        System.out.println("Despesas de Vendas: " + despesasDeVendas);
        System.out.println("Despesas Administrativas: " + despesasAdministrativas);
        System.out.println("Lucro Operacional: " + lucroOperacional);
        System.out.println("Despesas Financeiras: " + despesasFinanceiras);
        System.out.println("Lucro Liquido antes do IR: " + lucroLiquidoAntesDoIR);
        System.out.println("IR: " + IR);
        System.out.println("TOTAL: " + lucroLiquido);
        System.out.println("=====================");
        
    }
}
