public class QuickSort<Tipo extends Number>{
    public Tipo[] key;

    public QuickSort(Tipo[] k) {        // Construtor da classe
        this.key = k;
    }

    public void ordenarInt(){
        int n = this.key.length;

        Integer[] vetor = new Integer[n];
        for(int i = 0; i < n;i++){
            vetor[i] = this.key[i].intValue();
        }

        //System.out.println(n);
        quickSortInt(vetor, 0, n - 1);

        System.out.println("Vetor ordenado em ordem decrescente: ");
        for(int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }

    private void quickSortInt(Integer[] vetor, int inicio, int fim) {
        if(inicio < fim) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividirInt(vetor, inicio, fim);
            System.out.println("index pivo = " + indexPivo);

            quickSortInt(vetor, inicio, indexPivo - 1);
            quickSortInt(vetor, indexPivo + 1, fim);
        }
    }

    private int dividirInt(Integer[] vetor, int inicio, int fim) {
        System.out.println(inicio +" e "+ fim);

        Integer pivo;
        int pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        ou ate que o elemento em questão seja menor que o pivô. */
            while(pontEsq <= pontDir && vetor[pontEsq] > pivo) {
                pontEsq++;
            }

      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        que o elemento em questão seja maior que o pivô. */
            while(pontDir >= pontEsq && vetor[pontDir] <= pivo) {
                pontDir--;
            }

      /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
            if(pontEsq < pontDir) {
                trocarInt(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocarInt(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocarInt(Integer[] vetor, int i, int j) {
        Integer temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public void ordenarDouble(){
        int n = this.key.length;

        Double[] vetor = new Double[n];
        for(int i = 0; i < n;i++){
            vetor[i] = this.key[i].doubleValue();
        }

        //System.out.println(n);
        quickSortDouble(vetor, 0, n - 1);

        System.out.println("Vetor ordenado em ordem decrescente: ");
        for(int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }

    private void quickSortDouble(Double[] vetor, int inicio, int fim) {
        if(inicio < fim) {
            //Chamada da rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividirDouble(vetor, inicio, fim);
            System.out.println("index pivo = " + indexPivo);

            quickSortDouble(vetor, inicio, indexPivo - 1);
            quickSortDouble(vetor, indexPivo + 1, fim);
        }
    }

    private int dividirDouble(Double[] vetor, int inicio, int fim) {
        System.out.println(inicio +" e "+ fim);

        Double pivo;
        int pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while(pontEsq <= pontDir) {
      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        ou ate que o elemento em questão seja menor que o pivô. */
            while(pontEsq <= pontDir && vetor[pontEsq] > pivo) {
                pontEsq++;
            }

      /* Vai correr o vetor ate que ultrapasse o outro ponteiro
        que o elemento em questão seja maior que o pivô. */
            while(pontDir >= pontEsq && vetor[pontDir] <= pivo) {
                pontDir--;
            }

      /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
            if(pontEsq < pontDir) {
                trocarDouble(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocarDouble(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocarDouble(Double[] vetor, int i, int j) {
        Double temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
