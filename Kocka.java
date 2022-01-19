import java.util.ArrayList;
import java.util.Arrays;

public class Kocka {

    private int[] count = {0, 0, 0, 0, 0, 0};
    private ArrayList<Integer> hody = new ArrayList();

    public Kocka() {
    }

    public void set(int index) {
        hody.add(index+1);
        count[index]++;
    }

    public void getCount() {
        for (int i = 0; i < count.length; i++) {
            System.out.println("cislo " + (i+1) + " .......*" + count[i]);
        }
    }

    public void getHody() {
        for (int i:hody) {
            System.out.println(i);
        }
    }
}
