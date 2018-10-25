package independentcopy;

import java.util.ArrayList;

public class ListWriter implements Writer
{
    ArrayList<String> someList;

    public ListWriter()
    {
        someList = new ArrayList<String>();
        someList.add("Jared was here");
        someList.add("So was Sean");
        someList.add("And Jordan");
        someList.add("Not to mention Tony...");
    }

    @Override
    public void writeln(String line)
    {
        someList.add(line);
    }
}
