import java.util.Scanner;

/*public class Lec_12 {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");

        String firstName = "Tony";
        String lastName = "Mishra";
        String fullName = firstName + " " + lastName;    //concatenation
        System.out.println(fullName);


        //charAt
//        for (int i = 0; i < fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));       //wil give word of every index of sentence


            //compare
            String name1 = "Tony";
            String name2 = "Mishra";
            if (name1.compareTo(name2) == 0) {         //it can't be ((new String("Arp")==(new String("Arp")); bcz new creates
                                                        //two objects and two object can't be same..they are created in diff memory.
                System.out.println("String are equal");
            }
            else {
                System.out.println("Strings aren't equal");
            }

        }
    }
}*/


public class Lec_12 {
    public static void main(String[] args) {
        String name = " Arpan ";       //Don't forget spaces
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2,4)); //Index 2 is included and index 4 is excluded in applying
        System.out.println(name.replace("A","P"));
        //System.out.println(name.replace("Ar","p"));
        System.out.println(name.startsWith(" Ar"));  //gives boolean value
        System.out.println(name.endsWith("na "));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("pan",1));
        System.out.println(name.trim());
        System.out.println(name.equals(" Arpan "));
        System.out.println(name.equalsIgnoreCase(" aRpan "));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",4));

    }
}


