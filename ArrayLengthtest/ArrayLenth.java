class ArrayLenth {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i;
        int len = a.length;
        for (i = 0; i < len; i++)
            a[i] = 5 * (i + 1);
        for (i = 0; i < len; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        
        for (int row : a)
            System.out.print(row + " ");
    }
}