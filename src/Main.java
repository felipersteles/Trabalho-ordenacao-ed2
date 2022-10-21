public class Main {
    public static void main(String[] args) {
        Tree myTree;

        myTree = new Tree(7);       // создать дерево (с ключом)
        myTree.insert(new Tree(5));  // присоединять поддеревья
        myTree.insert(new Tree(9));

        myTree.desvio(new KeyPrinter());
    }

    private static void menu(){

    }
}