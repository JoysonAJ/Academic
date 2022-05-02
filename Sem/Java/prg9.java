public class prg9 {
    public static void main(String[] args) {
        String s1 = "Lailesh ALways takes studies very seriiously";
        String s2 = "HELLO WORLD IS GOOD";
        long timess, total;
        timess = System.currentTimeMillis();
        StringBuilder b = new StringBuilder(s1);
        for (int i = 0; i < 100000; i++) {
            b.append(s2);
        }
        System.out.println("The time is equal to");
        total = System.currentTimeMillis() - timess; // - timess;
        System.out.println(total);

        StringBuffer bf = new StringBuffer(s1);
        timess = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            bf.append(s2);
        }
        System.out.println("The time is equal to");
        total = System.currentTimeMillis() - timess; // - timess;

        System.out.println(total);
    }
}
