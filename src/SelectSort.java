public class SelectSort<Tipo extends Number> {
    public Tipo[] key;

    public SelectSort(Tipo[] k) {        // Construtor da classe
        this.key = k;
    }

    public void ordenar(){
        int indiceMaior;
        Tipo maior;
        Tipo[] vetor = this.key;
        
        for(int i = 0; i< vetor.length - 1;i++){
            indiceMaior = i;
            maior = vetor[i];
            
            for(int j = i+1;j<vetor.length;j++){
                if(vetor[j].doubleValue() > vetor[indiceMaior].doubleValue()){
                    indiceMaior = j;
                    maior = vetor[indiceMaior];
                }
            }

            vetor[indiceMaior] = vetor[i];
            vetor[i] = maior;
        }

        System.out.println("Vetor ordenado em ordem decrescente: ");
        for(int i = 0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
