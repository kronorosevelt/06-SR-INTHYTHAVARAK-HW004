package homework4;

import java.util.ArrayList;
import java.util.List;

public class Generic<E> {
    List<E> data = new ArrayList<E>();
    public void add( E input) throws DuplicErr {
        if (data.contains(null)) {
            throw new DuplicErr("Null is not Allowed");
        } else if (data.contains(input)) {
            throw new DuplicErr(input+"is Duplicated");
        } else {
            data.add(input);
        }
    }
    public E get(int i){return data.get(i);}
    public int size() {return data.size();}

}
