class ArrayExample {
    public static void main(String[] args) {
        int[] age = new int[5];

        // insert 14 to third element
        age[2] = 14;

        // insert 34 to first element
        age[0] = 34;

        for (int i = 0; i < 5; ++i) {
            System.out.println("Element at index " + i + ": " + age[i]);
        }
    }
}
