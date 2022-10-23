public class Tree<Tipo extends Number> {
    public Tree left;            // São as subarvores esquerda e direita
    public Tree right;
    public Tipo key;

    public Tree(Tipo k) {        // Construtor da classe
        key = k;
    }

    /*
        se a chave K for maior que o nó raiz X então o valor sera adicionado a subarvore da direita
        caso contrario sera adicionado a subarvore da esquerda
        caso não haja subarvore entao insira no lugar da chave
    */
    public void insertDouble(Tree<Double> subarvore) {
        if (subarvore.key < key.doubleValue()) {
            if (left != null) left.insertDouble(subarvore);
            else left = subarvore;
        } else {
            if (right != null) right.insertDouble(subarvore);
            else right = subarvore;
        }
    }

    public void insertInt(Tree<Integer> subarvore) {
        if (subarvore.key < key.intValue()) {
            if (left != null) left.insertInt(subarvore);
            else left = subarvore;
        } else {
            if (right != null) right.insertInt(subarvore);
            else right = subarvore;
        }
    }

    /*  Desvio
        Percorrer a subarvore da esquerda recursivamente
        dando print no nó da raiz
    */
    public void desvio(TreeVisitor visitor) {
        if (left != null)
            left.desvio(visitor);

        visitor.visit(this);

        if (right != null)
            right.desvio(visitor);
    }
}

interface TreeVisitor {
    public void visit(Tree node);
};

class KeyPrinter implements TreeVisitor {
    public void visit(Tree node) {

        System.out.print(node.key + " ");
    }
};
