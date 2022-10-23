
import javax.swing.plaf.synth.Region;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] autores = new String[2];
        autores[0] = "Felipe Teles(felipersteles)";
        autores[1] = "Rodrigo Pontes(rodrigo.pontis)";

        Creditos(autores);

        Codigo();
    }

    private static void Creditos(String[] autores){
        System.out.print("Código desenvoldido e implementado por: ");
        for(int i = 0; i< autores.length;i++){
            System.out.println();
            System.out.print(autores[i]+ " ");
        }

        System.out.println();
        System.out.println();
    }

    //Metodo para auxiliar na criacao de vetores inteiros
    private static Integer[] criaVetorInt(int n) {
        Integer vetor[] = new Integer[n];
        Scanner scan = new Scanner(System.in);

        System.out.println("Preencha o vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = scan.nextInt();
        }

        return vetor;
    }

    //Metodo para auxiliar na criacao de vetores Double
    private static Double[] criaVetorDouble(int n) {
        Double vetor[] = new Double[n];
        Scanner scan = new Scanner(System.in);

        System.out.println("Preencha o vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = scan.nextDouble();
        }

        return vetor;
    }

    //menu para escolher o tipo de variavel que sera ordenada
    private static void Codigo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o tipo:\n1: Integer\n2: Double\n3: String");
        System.out.print("Insira sua resposta: ");
        int menu = scan.nextInt();

        if (menu == 1 || menu == 2) {
            Menu(menu);
        } else if (menu == 3) {
            System.out.println("Incompleto.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void Menu(int menu) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o numero de termos do vetor: ");
        int n = scan.nextInt();

        if(menu == 1){
            Integer vetor[] = criaVetorInt(n);

            System.out.print("\nSelecione o tipo de ordenação:\n1: Crescente\n2: Decrescente ");
            System.out.print("\nInsira sua resposta: ");
            int ordem = scan.nextInt();

            SortInt(ordem, vetor);
        }else if(menu ==2 ){
            Double vetor[] = criaVetorDouble(n);

            System.out.print("\nSelecione o tipo de ordenação:\n1: Crescente\n2: Decrescente ");
            System.out.print("\nInsira sua resposta: ");
            int ordem = scan.nextInt();

            SortDouble(ordem, vetor);
        }


    }

    private static void SortInt(int menu, Integer[] vetor) {
        Scanner scan = new Scanner(System.in);
        int ordem = -1;
        boolean aux = false;

        if (menu == 1) {
            while(aux != true){
                System.out.println("\nDesejas utilizar que método de ordenação?\n1: TreeSort\n2: MergeSort\n3: HeapSort\n");
                System.out.print("Insira sua resposta: ");
                ordem = scan.nextInt();

                if(ordem == 1 || ordem == 2 || ordem == 3) aux = true;
                else {
                    System.out.println("\nOpção invalida. Digite novamente. ");
                }
            }
            System.out.println();
        } else if(menu == 2) {
            while(aux != true) {
                System.out.println("\nDesejas utilizar que método de ordenação?\n4: SelectSort\n5: QuickSort");
                System.out.print("Insira sua resposta: ");
                ordem = scan.nextInt();

                if(ordem == 4 || ordem == 5) aux = true;
                else {
                    System.out.println("\nOpção invalida. Digite novamente. ");
                }
            }
            System.out.println();
        }


        if (ordem == 1) {
            TreeSortInt(vetor); // tree sort de inteiros
        } else if (ordem == 2) {
            MergeSortInt(vetor);
        } else if (ordem == 3) {
            //HeapSort();
            System.out.println("Não implementado");
        } else if (ordem == 4) {
            SelectSortInt(vetor);
        } else if (ordem == 5) {
            QuickSortInt(vetor);
        }
    }

    private static void SortDouble(int menu, Double[] vetor) {
        Scanner scan = new Scanner(System.in);
        int ordem = -1;
        boolean aux = false;

        if (menu == 1) {
            while(aux != true){
                System.out.println("\nDesejas utilizar que método de ordenação?\n1: TreeSort\n2: MergeSort\n3: HeapSort\n");
                System.out.print("Insira sua resposta: ");
                ordem = scan.nextInt();

                if(ordem == 1 || ordem == 2 || ordem == 3) aux = true;
                else {
                    System.out.println("\nOpção invalida. Digite novamente. ");
                }
            }
            System.out.println();
        } else if(menu == 2) {
            while(aux != true) {
                System.out.println("\nDesejas utilizar que método de ordenação?\n4: SelectSort\n5: QuickSort");
                System.out.print("Insira sua resposta: ");
                ordem = scan.nextInt();

                if(ordem == 4 || ordem == 5) aux = true;
                else {
                    System.out.println("\nOpção invalida. Digite novamente. ");
                }
            }
            System.out.println();
        }


        if (ordem == 1) {
            TreeSortDouble(vetor); // tree sort de inteiros
        } else if (ordem == 2) {
            MergeSortDouble(vetor);
        } else if (ordem == 3) {
            //HeapSort();
            System.out.println("Não implementado");
        } else if (ordem == 4) {
            SelectSortDouble(vetor);
        } else if (ordem == 5) {
            QuickSortDouble(vetor);
        }
    }

    // metodo para variaveis inteiras ----------------------------------------------------------------------------------------------------------------------

    private static void TreeSortInt(Integer[] vetor) {
        Tree<Integer> myTree;

        if (vetor != null) {
            myTree = new Tree(vetor[0]);
            for (int i = 1; i < vetor.length; i++) {
                myTree.insertInt(new Tree(vetor[i]));
            }

            System.out.println("Vetor ordenado em ordem crescente: ");
            myTree.desvio(new KeyPrinter());
        }
    }

    private static void SelectSortInt(Integer[] vetor) {
        SelectSort<Integer> selectSort;

        if (vetor != null) {
            selectSort = new SelectSort(vetor);
            selectSort.ordenar();
        }
    }

    ;

    private static void MergeSortInt(Integer[] vetor) {
        MergeSort<Integer> mergeSort;

        if (vetor != null) {
            mergeSort = new MergeSort(vetor);
            mergeSort.ordenarInt();
        }
    }

    ;

    private static void QuickSortInt(Integer[] vetor) {
        QuickSort<Integer> quickSort;

        if (vetor != null) {
            quickSort = new QuickSort(vetor);
            quickSort.ordenarInt();
        }
    }
    //---------------------------------------------------------------------------------------------------------------------- ----------------------------------------------------------------------------------------------------------------------

    //Metodo para variaveis double-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static void TreeSortDouble(Double[] vetor) {
        Tree<Double> myTree;

        if (vetor != null) {
            myTree = new Tree(vetor[0]);
            for (int i = 1; i < vetor.length; i++) {
                myTree.insertDouble(new Tree(vetor[i]));
            }

            System.out.println("Vetor ordenado em ordem crescente: ");
            myTree.desvio(new KeyPrinter());
        }
    }

    private static void SelectSortDouble(Double[] vetor) {
        SelectSort<Integer> selectSort;

        if (vetor != null) {
            selectSort = new SelectSort(vetor);
            selectSort.ordenar();
        }
    }

    ;

    private static void MergeSortDouble(Double[] vetor) {
        MergeSort<Double> mergeSort;

        if (vetor != null) {
            mergeSort = new MergeSort(vetor);
            mergeSort.ordenarDouble();
        }
    }

    ;

    private static void QuickSortDouble(Double[] vetor) {
        QuickSort<Double> quickSort;

        if (vetor != null) {
            quickSort = new QuickSort(vetor);
            quickSort.ordenarDouble();
        }
    }
    //---------------------------------------------------------------------------------------------------------------------- ----------------------------------------------------------------------------------------------------------------------
}