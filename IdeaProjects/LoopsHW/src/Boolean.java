public class Boolean {
    public static boolean isMale(String name){

        int lastCharIndex = name.length() - 1;
        boolean isFemale = name.charAt(lastCharIndex) == 'a';

        if (isFemale){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isMale = isMale("Nastya");
        System.out.println("Is male: "+isMale);
    }

}
