package TestSearching.P7.MergesortTest;

public class MergeSortMain18 {
    public static void main(String[] args) {
        
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("sorting dengan merge sort");
        MergeSorting18 mSort = new MergeSorting18();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
