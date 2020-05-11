package homework4;
import homework4.Generic;
public class Main  {
    public static void main(String[] args)  {
        Generic<Integer> integerGeneric = new Generic<>();
        try {
            integerGeneric.add(null);
        } catch (DuplicErr duplicErr) {
            System.out.println(duplicErr);
        }
        System.out.println("All items that has been input: ");
        for (int i =0; i<integerGeneric.size();i++){
            System.out.println(integerGeneric.get(i));
        }

    }
}
