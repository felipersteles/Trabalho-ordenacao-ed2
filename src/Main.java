
import javax.swing.plaf.synth.Region;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Menu();
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
    private static void Menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o tipo:\n1: Integer\n2: Double\n3: String");
        System.out.print("Insira sua resposta: ");
        int menu = scan.nextInt();

        if (menu == 1) {
            menuInt(); //chama menu para order inteiros
        }else if(menu == 2){
            menuDouble();
        }
    }

    // metodo para variaveis inteiras ----------------------------------------------------------------------------------------------------------------------
    private static void menuInt() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o numero de termos do vetor: ");
        int n = scan.nextInt();

        Integer vetor[] = criaVetorInt(n);

        System.out.print("\nSelecione o tipo de ordenação:\n1: Crescente\n2: Decrescente ");
        System.out.print("\nInsira sua resposta: ");
        int menu = scan.nextInt();
        OrdemInt(menu, vetor);
    }

    private static void OrdemInt(int menu, Integer[] vetor) {
        Scanner scan = new Scanner(System.in);
        int ordem;

        if (menu == 1) {
            System.out.println("\nDesejas utilizar que método de ordenação?\n1: TreeSort\n2: Merge\n3: HeapSort\n");
            System.out.print("Insira sua resposta: ");
        } else {
            System.out.println("\nDesejas utilizar que método de ordenação?\n4: SelectSort\n5: QuickSort");
            System.out.print("Insira sua resposta: ");
        }
        ordem = scan.nextInt();

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

    private static void TreeSortInt(Integer[] vetor) {
        Tree<Integer> myTree;

        if (vetor != null) {
            myTree = new Tree(vetor[0]);
            for (int i = 1; i < vetor.length; i++) {
                myTree.insertInt(new Tree(vetor[i]));
            }

            myTree.desvio(new KeyPrinter());
        }
    }

    private static void SelectSortInt(Integer[] vetor){
        SelectSort<Integer> selectSort;

        if (vetor != null) {
            selectSort = new SelectSort(vetor);
            selectSort.ordenar();
        }
    };

    private static void MergeSortInt(Integer[] vetor){
        MergeSort<Integer> mergeSort;

        if (vetor != null) {
            mergeSort = new MergeSort(vetor);
            mergeSort.ordenarInt();
        }
    };

    private static void QuickSortInt(Integer[] vetor){
        QuickSort<Integer> quickSort;

        if (vetor != null) {
            quickSort = new QuickSort(vetor);
            quickSort.ordenarInt();
        }
    }
    //---------------------------------------------------------------------------------------------------------------------- ----------------------------------------------------------------------------------------------------------------------

    //Metodo para variaveis 1double-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void menuDouble(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o numero de termos do vetor: ");
        int n = scan.nextInt();

        Double vetor[] = criaVetorDouble(n);

        System.out.print("\nSelecione o tipo de ordenação:\n1: Crescente\n2: Decrescente ");
        System.out.print("\nInsira sua resposta: ");
        int menu = scan.nextInt();
        OrdemDouble(menu, vetor);
    }

    private static void OrdemDouble(int menu, Double[] vetor) {
        Scanner scan = new Scanner(System.in);
        int ordem;

        if (menu == 1) {
            System.out.println("\nDesejas utilizar que método de ordenação?\n1: TreeSort\n2: Merge\n3: HeapSort\n");
            System.out.print("Insira sua resposta: ");
        } else {
            System.out.println("\nDesejas utilizar que método de ordenação?\n4: SelectSort\n5: QuickSort");
            System.out.print("Insira sua resposta: ");
        }
        ordem = scan.nextInt();

        if (ordem == 1) {
            TreeSortDouble(vetor); // tree sort de inteiros
        } else if (ordem == 2) {
            MergeSortDouble(vetor);
        } else if (ordem == 3) {
            //HeapSortDouble();
            System.out.println("Não implementado");
        } else if (ordem == 4) {
            SelectSortDouble(vetor);
        } else if (ordem == 5) {
            //QuickSortDouble();
            System.out.println("Incompleto");
        }
    }

    private static void TreeSortDouble(Double[] vetor) {
        Tree<Double> myTree;

        if (vetor != null) {
            myTree = new Tree(vetor[0]);
            for (int i = 1; i < vetor.length; i++) {
                myTree.insertDouble(new Tree(vetor[i]));
            }

            myTree.desvio(new KeyPrinter());
        }
    }

    private static void SelectSortDouble(Double[] vetor){
        SelectSort<Integer> selectSort;

        if (vetor != null) {
            selectSort = new SelectSort(vetor);
            selectSort.ordenar();
        }
    };

    private static void MergeSortDouble(Double[] vetor){
        MergeSort<Double> mergeSort;

        if (vetor != null) {
            mergeSort = new MergeSort(vetor);
            mergeSort.ordenarDouble();
        }
    };
    //---------------------------------------------------------------------------------------------------------------------- ----------------------------------------------------------------------------------------------------------------------
}