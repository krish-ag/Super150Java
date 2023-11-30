package tut.arraylists;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();  // default size is 10
        ll.add(10);
        ll.add(30);
        ll.add(20);
        ll.add(40);
        ll.add(50);
//        ll.remove(ll.size() - 1);
//        ll.add(0, 30);
//        ll.lastIndexOf(10);
        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));

        }

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
