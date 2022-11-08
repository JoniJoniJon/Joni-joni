package quicksort;
public class Quicksort {
    public static void main(String[] args) {

    int[] nilai = {15,76,45,98,34};
    quicksort(nilai);
}
    
public static void quicksort(int[]angka){
    System.out.println("--------Quick Sort--------");
    System.out.println("Sebelum : ");
    for (int a:angka){
        System.out.print(a + " ");
    }
    //prosedur array, index terkecil-terbesar
    quicksortalgoritm(angka, 0, angka.length-1);
    
    System.out.println("Sesudah : ");
    for (int a:angka){
        System.out.print(a+" ");
    }
}
    public static void quicksortalgoritm(int[]angka, int indexawal, int indexakhir){
        int i = indexawal;
        int j = indexakhir;
        int pivot = angka[indexawal];
        
        while(i <= j){
            while(angka[i] < pivot){
            i++;
            }
            while (angka [j]> pivot){
            j--;
                }
            if(i <= j){
            int tampungan = angka[i];
            angka[i] = angka[j];
            angka[j] = tampungan;
            i++;
            j--;
                }
        }
            if (indexawal < j){
                quicksortalgoritm(angka, indexawal, j);
                }
            if (i < indexakhir){
                quicksortalgoritm(angka, i, indexakhir);
        }
       
    
    }
    
}

