package independentcopy;

import java.util.ArrayList;

/**
 * Class model for an array list writer
 * @author Jared Mallas
 * @version 1.0
 */
public class ListWriter implements Writer
{
    ArrayList<String> someList;

    public ListWriter(ArrayList<String> someList)
    {
        this.someList = someList;
    }

    /**
     * Adds a string to the array list
     * @param line String to add to array list
     */
    @Override
    public void writeln(String line)
    {
        someList.add(line);
    }

    public ArrayList<String> getSomeList() {
        return someList;
    }
}
