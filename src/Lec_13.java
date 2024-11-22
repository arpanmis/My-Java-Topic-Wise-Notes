
/*public class Lec_13 {
    public static void main(String[] args) {
    // String builder modify the same character in heap memory instead of creating another character.
        // String/String Builder function are stored in Stack.
        StringBuilder name = new StringBuilder("Tony");

        System.out.println(name);
        System.out.println(name.charAt(2));

        //new in SB:(Set char at index)

//        name.setCharAt(0,'p');   //it changes the String
//        System.out.println(name);

        //new in SB: (Insert a char at index)

        name.insert(2,'n');
        System.out.println(name);

        //new in SB: (deleting a char)
        name.delete(0,2);         //Non-Inclusive Working
        System.out.println(name);

        //New in SB : (Appending char)
        name.append("y");        //in this there's nothing changes in memory multiple times
        name.append(" ");
        name.append("S");
        System.out.println(name);


    }
}*/



//Q1. Reversing a String:

public class Lec_13 {
    public static void main(String[] args) {
        StringBuilder reverseName = new StringBuilder("Earth");
        for (int i = 0; i < reverseName.length()/2; i++) {
            int front = i;
            int back = reverseName.length()-1-i;   //5-1-0
            char frontChar = reverseName.charAt(front);
            char backChar = reverseName.charAt(back);
            reverseName.setCharAt(front, backChar);
            reverseName.setCharAt(back,frontChar);
        }
        System.out.println(reverseName);

    }
}