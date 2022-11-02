class node {
    private int data;
    private node next;
    void setData(int x) { data = x; }
    int getData() { return data; }
    node getNext() { return next; }
    void setNext(node x) { next = x; }
}

public class ObjArray {
    public static void main(String[] args) {
        node x[] = new node[3]; //创建三个节点对象，对象作为数组元素
        int i;
        for (i = 0; i < x.length; i++)
            x[i] = new node();
        for (i = 0; i < x.length; i++) {    
            x[i].setData(i);                //给节点的data赋值
            if (i < x.length - 1)
                x[i].setNext(x[i + 1]);     
        }

        node start= new node();
        start = x[0];
        System.out.println(start.getData());
        while (start.getNext() != null) {
            start = start.getNext();
            System.out.println(start.getData());
        }
    }
}