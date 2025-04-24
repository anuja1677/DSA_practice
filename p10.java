class Count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;

        int count = countNum(arr, 0, target);
        System.out.println("Count: " + count);
    }

    static int countNum(int[] arr, int i, int num) {
        if (i == arr.length)
            return 0;
        if (arr[i] == num)
            return 1 + countNum(arr, i + 1, num);
        else
            return countNum(arr, i + 1, num);
    }
}