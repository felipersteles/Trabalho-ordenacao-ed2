public class Tree {
    public Tree left;            // São as subarvores esquerda e direita
    public Tree right;
    public int key;

    public Tree(int k) {        // Construtor da classe
        key = k;
    }

    /*
        se a chave K for maior que o nó raiz X então o valor sera adicionado a subarvore da direita
        caso contrario sera adicionado a subarvore da esquerda
        caso não haja subarvore entao insira no lugar da chave
    */
    public void insert(Tree subarvore) {
        if (subarvore.key < key) {
            if (left != null) left.insert(subarvore);
            else left = subarvore;
        } else {
            if (right != null) right.insert(subarvore);
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
        System.out.println(" " + node.key);
    }
};
