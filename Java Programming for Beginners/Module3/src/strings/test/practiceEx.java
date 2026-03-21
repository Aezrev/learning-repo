package strings.test;

public class practiceEx {
    public static void main(String[] args) {
        String s1 = "Maple Tree";
        String s2 = "Maple Tree";
        System.out.println("Are s1 and s2 equal?"+ s1==s2);
        String s3 = new String("Maple Tree");
        System.out.println("Are s1 and s3 equal?"+ s1==s2);
        System.out.println("Are s1 and s3 equal? "+ s3.equals(s1));
        String s1substr1 = s1.substring(0,4);
        String s1substr2 = s1.substring(4,s1.length()-1);
        String s1concat = s1substr1.concat(" ").concat(s1substr2);
        s1.toLowerCase();
        s1.toUpperCase();
    }
}
