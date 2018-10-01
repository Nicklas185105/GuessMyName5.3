import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class GætMitNavn {
    private static void nameBefore(){
        System.out.println("Mit er før i alfabetet.");
    }
    private static void nameAfter(){
        System.out.println("Mit navn er efter i alfabetet.");
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        boolean nameGuess = false;
        String name;
        String realName;

        realName = input.nextLine();

        /*String c = "N";
        int a=Character.getNumericValue(c.charAt(0));
        System.out.println(a);*/




        do{
            name = input.nextLine();
            if (name.equalsIgnoreCase(realName)){
                System.out.println("Du gættede rigtigt.");
                nameGuess = true;
            } else if (Character.getNumericValue(name.charAt(0)) != Character.getNumericValue(realName.charAt(0))){
                //System.out.println(name.charAt(0));
                if (Character.getNumericValue(name.charAt(0)) > Character.getNumericValue(realName.charAt(0)) || Character.getNumericValue(name.charAt(0)) == -1){
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(0)) < Character.getNumericValue(realName.charAt(0))){
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(1)) != Character.getNumericValue(realName.charAt(1))){
                //System.out.println(name.charAt(1));
                if(Character.getNumericValue(name.charAt(1)) > Character.getNumericValue(realName.charAt(1)) || Character.getNumericValue(name.charAt(1)) == -1){
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(1)) < Character.getNumericValue(realName.charAt(1))){
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(2)) != Character.getNumericValue(realName.charAt(2))){
                //System.out.println(name.charAt(2));
                if(Character.getNumericValue(name.charAt(2)) > Character.getNumericValue(realName.charAt(2)) || Character.getNumericValue(name.charAt(2)) == -1){
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(2)) < Character.getNumericValue(realName.charAt(2))){
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(3)) != Character.getNumericValue(realName.charAt(3))) {
                //System.out.println(name.charAt(3));
                if (Character.getNumericValue(name.charAt(3)) > Character.getNumericValue(realName.charAt(3)) || Character.getNumericValue(name.charAt(3)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(3)) < Character.getNumericValue(realName.charAt(3))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(4)) != Character.getNumericValue(realName.charAt(4))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(4)) > Character.getNumericValue(realName.charAt(4)) || Character.getNumericValue(name.charAt(4)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(4)) < Character.getNumericValue(realName.charAt(4))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(5)) != Character.getNumericValue(realName.charAt(5))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(5)) > Character.getNumericValue(realName.charAt(5)) || Character.getNumericValue(name.charAt(5)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(5)) < Character.getNumericValue(realName.charAt(5))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(6)) != Character.getNumericValue(realName.charAt(6))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(6)) > Character.getNumericValue(realName.charAt(6)) || Character.getNumericValue(name.charAt(6)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(6)) < Character.getNumericValue(realName.charAt(6))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(7)) != Character.getNumericValue(realName.charAt(7))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(7)) > Character.getNumericValue(realName.charAt(7)) || Character.getNumericValue(name.charAt(7)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(7)) < Character.getNumericValue(realName.charAt(7))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(8)) != Character.getNumericValue(realName.charAt(8))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(8)) > Character.getNumericValue(realName.charAt(8)) || Character.getNumericValue(name.charAt(8)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(8)) < Character.getNumericValue(realName.charAt(8))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(9)) != Character.getNumericValue(realName.charAt(9))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(9)) > Character.getNumericValue(realName.charAt(9)) || Character.getNumericValue(name.charAt(9)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(9)) < Character.getNumericValue(realName.charAt(9))) {
                    nameAfter();
                }
            } else if (Character.getNumericValue(name.charAt(10)) != Character.getNumericValue(realName.charAt(10))) {
                //System.out.println(name.charAt(4));
                if (Character.getNumericValue(name.charAt(10)) > Character.getNumericValue(realName.charAt(10)) || Character.getNumericValue(name.charAt(10)) == -1) {
                    nameBefore();
                } else if (Character.getNumericValue(name.charAt(10)) < Character.getNumericValue(realName.charAt(10))) {
                    nameAfter();
                }
            }
        }
        while(!nameGuess);
    }
}
