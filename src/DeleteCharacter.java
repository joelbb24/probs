public class DeleteCharacter {
    public static void main(String[] args) {
        /*
        remove a character from string.
        sample: input: (banana, a) output: bnn
         */

        String input = "banana";
        char target = 'a';

        System.out.println(deleteCharacter(input, target));
    }

    private static String deleteCharacter(String input, char target) {
        return input.replaceAll("a","");
    }
}
