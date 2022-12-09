package com.gsr;

public class FindSecondHighestNumber {

    private static int findSecondHighestNumber(int[] numbers) {
        int size = numbers.length ;
        int firstlargest = 0  ;
        int secondlargest = -1;
        // test case for empty array
        if(size == 0) {
            System.out.println("Arrays have no elements");
            return 0;
            // test case for one element array
        } else if(size < 2) {
            System.out.println("Arrays have less numbers for compare");
            return numbers[size-1];
            // actual implementation time complexity is O(n) and space complexity is O(1)
        } else if(size >= 2) {
            for (int i = 0; i < size; i++) {
                if(numbers[i] > numbers[firstlargest]) {
                    secondlargest = firstlargest;
                    firstlargest = i;
                } else if (numbers[i] < numbers[firstlargest] && (secondlargest == -1 || numbers[secondlargest] < numbers[i])) {
                    secondlargest = i;
                }
            }
        }
        return numbers[secondlargest];
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,-4,5,12, 35, 34, 10, 34, 1,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
                74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
                96, 97, -98, 99};
        int number = findSecondHighestNumber(numbers);
        System.out.println(number);
    }
}
