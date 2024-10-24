import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LojaOnLine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    LinkedList<String> carrinho = new LinkedList<>();
    LinkedList<Double> valor = new LinkedList<>();

    Roupas roupa = new Roupas();
    Eletronicos eletronico = new Eletronicos();
    Alimentos alimento = new Alimentos();

    int categoria;
    double valorAcumulado = 0;
    double preco = 0;

    System.out.println("\nSistema de Compras");

        do {
            System.out.printf("\t\t\t\tSubtotal: R$ %.2f\n", valorAcumulado);
            System.out.println("Categoria:");
            System.out.println("1 - Roupa \t\t2 - Eletrônico \n3 - Alimento \t4 - Encerrar compra");
            System.out.print("Opção: ");
            categoria = sc.nextInt();
            sc.nextLine();
            int opItem;
            switch (categoria) {

                case 1:
                    while (categoria == 1) {
                        roupa.listarItem(new LinkedList<>());
                        String subCategoria1 = sc.nextLine();
                        carrinho.add(subCategoria1);
                        System.out.print("Valor: R$ ");
                        preco = sc.nextDouble();
                        valor.add(preco);
                        valorAcumulado += preco;
                        System.out.println("1 - Continuar comprando \t2 - Sair");
                        opItem = sc.nextInt();
                        sc.nextLine();
                        if (opItem == 1) {
                            continue;
                        } else if (opItem < 1 || opItem > 1) {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (categoria == 2) {
                        eletronico.listarItem(new LinkedList<>());
                        String subCategoria2 = sc.nextLine();
                        carrinho.add(subCategoria2);
                        System.out.print("Valor: R$ ");
                        preco = sc.nextDouble();
                        valor.add(preco);
                        valorAcumulado += preco;
                        System.out.println("1 - Continuar comprando \t2 - Sair");
                        opItem = sc.nextInt();
                        sc.nextLine();
                        if (opItem == 1) {
                            continue;
                        } else if (opItem < 1 || opItem > 1) {
                            break;
                        }

                    }
                    break;
                case 3:
                    while (categoria == 3) {
                        alimento.listarItem(new LinkedList<>());
                        String subCategoria3 = sc.nextLine();
                        carrinho.add(subCategoria3);
                        System.out.print("Valor: R$ ");
                        preco = sc.nextDouble();
                        valor.add(preco);
                        valorAcumulado += preco;
                        System.out.println("1 - Continuar comprando \t2 - Sair");
                        opItem = sc.nextInt();
                        sc.nextLine();
                        if (opItem == 1) {
                            continue;
                        } else if (opItem < 1 || opItem > 1) {
                            break;
                        }

                    }
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("Erro: A categoria " + categoria + " não existe.");
            }

                    if (categoria == 4) {
                        break;
                    }
                    categoria = 0;
            }while (categoria != 4) ;

            System.out.println("Ticket de compra");
            System.out.println("Quant de itens no carrinho: " + carrinho.size());

            for (int j = 0; j < carrinho.size(); j++) {
                System.out.print("Produto " + (j + 1) + ": " + carrinho.get(j));
                System.out.printf(" - R$ %.2f\n", valor.get(j));
            }

            System.out.printf("\nValor total: R$ %.2f\n", valorAcumulado);
        }
    }


