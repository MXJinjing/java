import java.io.*;

//Test BufferedReader class
public class TEST {

    public static void main(String[] args) throws IOException {
        BufferedReader new_stream;
        new_stream = new BufferedReader(new InputStreamReader(System.in));

        int new_int;
        new_int = Integer.parseInt(new_stream.readLine());

        System.out.println(new_int);
    }
}
