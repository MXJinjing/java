class testArrayLength {
    public static void main(String[] args) {
        int ia1[];
        int[] ia2;
        int ia3[] = { 1, 3, 5, 7, 9 };
        int ia4[] = new int[7];
        System.out.println("ia3的长度=" + ia3.length);
        System.out.println("ia4的长度=" + ia4.length);
        int[][] ia5 = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("ia5的长度=" + ia5.length);
        System.out.println("ia5[0]的长度=" + ia5[0].length);
        System.out.println("ia5[1]的长度=" + ia5[1].length);
        System.out.println("ia5[2]的长度=" + ia5[2].length);
    }
}
