/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Carregue uma matriz 3 x 3 com os valores das vendas de uma loja, supondo 3 meses e 3 vendedores.
    Calcule e mostre, em cada mês, qual foi o vendedor que vendeu mais.
 */
public class Ex64 {
    public static void main(String[] args) {
        double [][] vendas = {
                {2000,1000,3000},
                {2500,2800,2300},
                {3500,3200,3300}
        };

        System.out.println("     \tVENDEDOR 1\tVENDEDOR 2\tVENDEDOR 3");
        for (int mes = 0; mes < vendas.length; mes++) {
            System.out.print("MES " + (mes+1) + "\t");
            for (int vendedor = 0; vendedor < vendas.length; vendedor++) {
                System.out.print(vendas[mes][vendedor] + "\t\t");
            }
            System.out.println();

        }
        System.out.println();
        for (int mes = 0; mes < vendas.length; mes++) {
            double maior = 0;
            int numVendedorMaior = 0;
            for (int vendedor = 0; vendedor < vendas.length; vendedor++) {
                if (vendas[mes][vendedor] > maior){
                    maior = vendas[mes][vendedor];
                    numVendedorMaior = vendedor + 1;
                }
            }
            System.out.println("Maior venda do mes " + (mes+1) + ":");
            System.out.println("Vendedor " + (numVendedorMaior) + " - " + maior);
            System.out.println();

        }
    }
}
