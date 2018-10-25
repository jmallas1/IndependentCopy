package independentcopy;

import java.util.ArrayList;

public class ListWriter implements Writer
{
    ArrayList<String> someList;

    public ListWriter(ArrayList<String> someList)
    {
        this.someList = someList;
    }

    @Override
    public void writeln(String line)
    {
        someList.add(line);
    }
}
