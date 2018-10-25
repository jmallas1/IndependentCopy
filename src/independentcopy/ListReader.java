package independentcopy;

import java.util.ArrayList;

public class ListReader implements Reader
{
    ArrayList<String> someArrayList;

    public ListReader() {

        this.someArrayList = new ArrayList<String>();
        someArrayList.add("Killroy was here");
    }

    @Override
    public String readln() {
        return someArrayList.get(0);
    }
}
