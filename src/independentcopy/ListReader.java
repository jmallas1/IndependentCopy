package independentcopy;

import java.util.ArrayList;

public class ListReader implements Reader
{
    ArrayList<String> someList;

    public ListReader(ArrayList<String> someList) {

        this.someList = someList;
    }

    @Override
    public String readln() {
        return someList.get(someList.size() - 1);
    }
}
