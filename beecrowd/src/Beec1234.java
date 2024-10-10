public class Beec1234 {
    public String dancingSentence(String sentence) {
        boolean upper = true;
        StringBuilder result = new StringBuilder();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(upper ? Character.toUpperCase(c) : Character.toLowerCase(c));
                upper = !upper;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
