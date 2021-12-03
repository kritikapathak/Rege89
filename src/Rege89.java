public class Rege89 {
    public static void main(String[] args) {
        String arr[] = {"aaa", "abcd", "mamama"};
        for (String res : arr) {
            if (res.matches("[a-z]{4}") == true) {
                System.out.println(res);
            }
        }
    }
}

