public class MergeSort<Tipo extends Number>  {
    public Tipo[] key;

    public MergeSort(Tipo[] k) {        // Construtor da classe
        this.key = k;
    }

    public void ordenarInt(){

        int n = this.key.length;

        Integer[] vetor = new Integer[n];
        for(int i = 0; i< n;i++){
            vetor[i] = this.key[i].intValue();
        }

        mergeSortInt(vetor, n);

        System.out.println("Vetor ordenado em ordem crescente: ");
        for(int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }

    private void mergeSortInt(Integer[] vetor, int n) {

        if (n < 2) {
            return;
        }

        int mid = n / 2;
        Integer[] l = new Integer[mid];
        Integer[] r = new Integer[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = vetor[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = vetor[i];
        }
        mergeSortInt(l, mid);
        mergeSortInt(r, n - mid);

        mergeInt(vetor, l, r, mid, n - mid);
    }

    private void mergeInt(Integer[] vetor, Integer[] l, Integer[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                vetor[k++] = l[i++];
            }
            else {
                vetor[k++] = r[j++];
            }
        }
        while (i < left) {
            vetor[k++] = l[i++];
        }
        while (j < right) {
            vetor[k++] = r[j++];
        }
    }
    // Metodos de ordenação com double
    public void ordenarDouble(){

        int n = this.key.length;

        Double[] vetor = new Double[n];
        for(int i = 0; i< n;i++){
            vetor[i] = this.key[i].doubleValue();
        }

        mergeSortDouble(vetor, n);

        System.out.println("Vetor ordenado em ordem crescente: ");
        for(int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }

    private void mergeSortDouble(Double[] vetor, int n) {

        if (n < 2) {
            return;
        }

        int mid = n / 2;
        Double[] l = new Double[mid];
        Double[] r = new Double[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = vetor[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = vetor[i];
        }
        mergeSortDouble(l, mid);
        mergeSortDouble(r, n - mid);

        mergeDouble(vetor, l, r, mid, n - mid);
    }

    private void mergeDouble(Double[] vetor, Double[] l, Double[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                vetor[k++] = l[i++];
            }
            else {
                vetor[k++] = r[j++];
            }
        }
        while (i < left) {
            vetor[k++] = l[i++];
        }
        while (j < right) {
            vetor[k++] = r[j++];
        }
    }
}
