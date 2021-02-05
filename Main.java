package bubbleSort;

public class Main {

    public static void main(String[] args) {
	// **7.18 (Bubble sort) Write a sort method that uses the bubble-sort algorithm.
        // The bubblesort algorithm makes several passes through the array.
        // On each pass, successive neighboring pairs are compared.
        // If a pair is not in order, its values are swapped;
        // otherwise, the values remain unchanged.
        // The technique is called a bubble sort or sinking sort
        // because the smaller values gradually “bubble” their way
        // to the top and the larger values “sink” to the bottom.
        // Write a test program that reads in ten double numbers,
        // invokes the method, and displays the sorted numbers.

        System.out.println("Sorted list: ");

        int[] list = {47, 34, 43, 29, 89, 65, 73, 19, 90, 45};
        bubbleSort(list);
        for (int sortedList = 0; sortedList < list.length; sortedList++)
            System.out.println(list[sortedList] + " ");
    }

    private static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int newSortedList = 1; newSortedList < list.length && needNextPass; newSortedList++) {
            needNextPass = false;
            for (int sortedList = 0; sortedList < list.length - newSortedList; sortedList++) {
                if (list[sortedList] > list[sortedList +1]) {
                    int temp = list [sortedList];
                    list[sortedList] = list[sortedList + 1];
                    list[sortedList +1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
}
