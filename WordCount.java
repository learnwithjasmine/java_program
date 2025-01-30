public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, how are you?";

        String[] words = str.split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}