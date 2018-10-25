package independentcopy;

import java.util.ArrayList;

/**
 * Class model for an array list reader
 * @author Jared Mallas
 * @version 1.0
 */
public class ListReader implements Reader
{
    ArrayList<String> someList;

    public ListReader(ArrayList<String> someList) {

        this.someList = someList;
    }

    /**
     * Return a string of the last element of the array list
     * @return String representation of the last element of the array list
     */
    @Override
    public String readln() {
        return someList.get(someList.size() - 1);
    }
}
