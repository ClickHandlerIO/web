package react.client;

import java.util.ArrayList;

/**
 *
 */
public class Children {
    private ArrayList<Object> list;

    public ArrayList<Object> getList() {
        if (list == null) list = new ArrayList<>();
        return list;
    }

    public boolean isEmpty() {
        return list == null || list.isEmpty();
    }

    public Object[] toArray() {
        return DOM.toObjectArray(getList());
    }

    public Children add(Number... nums) {
        if (nums == null) {
            return this;
        }
        for (int i = 0; i < nums.length; i++) {
            getList().add(nums[i]);
        }
        return this;
    }

    public Children add(String... children) {
        if (children == null) {
            return this;
        }
        for (int i = 0; i < children.length; i++) {
            getList().add(children[i]);
        }
        return this;
    }

    public Children add(ReactElement... children) {
        if (children == null) {
            return this;
        }
        for (int i = 0; i < children.length; i++) {
            getList().add(children[i]);
        }
        return this;
    }
}
