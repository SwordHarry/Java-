package multiton;

import java.util.LinkedList;
import java.util.Random;

public class Multiton {

    private static LinkedList<Multiton> multitonList = new LinkedList<>();
    private static int length = 3;

    private Multiton() {

    }

    private static int random() {
        Random random = new Random();
        // 容错
        if (length == 1) {
            return 0;
        }else {
            return random.nextInt(length - 1) + 1;
        }

    }

    public static Multiton getInstance() {

        Multiton multiton;
        if (multitonList.size() < length) {
            synchronized (Multiton.class) {
                // 双重检测锁
                if (multitonList.size() < length) {
                    multiton = new Multiton();
                    multitonList.push(multiton);
                } else {
                    multiton = multitonList.get(random());
                }
            }
        } else {
            multiton = multitonList.get(random());
        }
        return multiton;
    }

    public static void setLength(int length) {
        // 容错，防止 length 小于1
        Multiton.length = length > 0 ? length : 1;
    }
}