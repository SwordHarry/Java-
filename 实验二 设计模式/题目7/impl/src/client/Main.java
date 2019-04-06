package client;

import adapter.OperationAdapter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 9, 7, 6, -4};
        OperationAdapter adapter = new OperationAdapter();
        adapter.sort(arr);
        int index = adapter.search(arr,7);

        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }
}
