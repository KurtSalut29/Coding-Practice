import java.util.Scanner;

public class ArrayProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Array Storage
        int[] numbers = {45, 12, 78, 23, 56, 9, 34};

        System.out.println("Original Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // 2. Searching Algorithm - Linear Search
        System.out.print("\n\nEnter a number to search: ");
        int target = input.nextInt();

        int searchComparisons = 0;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            searchComparisons++;

            if (numbers[i] == target) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Number found at index: " + position);
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("Search comparisons: " + searchComparisons);

        // 3. Sorting Algorithm - Bubble Sort
        int[] sortedNumbers = numbers.clone();
        int sortComparisons = 0;

        for (int i = 0; i < sortedNumbers.length - 1; i++) {
            for (int j = 0; j < sortedNumbers.length - 1 - i; j++) {

                sortComparisons++;

                if (sortedNumbers[j] > sortedNumbers[j + 1]) {
                    int temp = sortedNumbers[j];
                    sortedNumbers[j] = sortedNumbers[j + 1];
                    sortedNumbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        for (int number : sortedNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSorting comparisons: " + sortComparisons);

        input.close();
    }
}

