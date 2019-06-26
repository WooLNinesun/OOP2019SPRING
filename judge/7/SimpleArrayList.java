
public class SimpleArrayList {
    private Integer[] data;

    public SimpleArrayList() {
        this.data = new Integer[0];
    }

    public SimpleArrayList(int size) {
        this.data = new Integer[size];
        for (int i = 0; i < size; i++) {
            this.data[i] = 0;
        }
    }

    public void add(Integer element) {
        Integer[] old_array = this.data;
        int len = size();
        this.data = new Integer[len + 1];
        System.arraycopy(old_array, 0, this.data, 0, len);
        this.data[len] = element;
    }

    public Integer get(int index) {
        if (index >= size()) {
            return null;
        }
        return this.data[index];
    }

    public Integer set(int index, Integer element) {
        if (index >= size()) {
            return null;
        }
        Integer origin = this.data[index];
        this.data[index] = element;
        return origin;
    }

    public boolean remove(int index) {
        if (index >= size() || this.data[index] == null) {
            return false;
        }

        int len = size();
        System.arraycopy(this.data, index + 1, this.data, index, len - 1 - index);

        Integer[] old_array = this.data;
        this.data = new Integer[len - 1];
        System.arraycopy(old_array, 0, this.data, 0, len - 1);
        return true;
    }

    public void clear() {
        this.data = new Integer[0];
    }

    public int size() {
        return this.data.length;
    }

    public boolean retainAll(SimpleArrayList l) {
        int origin_length = size();

        int index = 0;
        for (int i = 0; i < origin_length; i++) {
            for (int j = 0; j < l.size(); j++) {
                if (this.data[i] == l.get(j)) {
                    this.data[index] = this.data[i];
                    index++;
                }
            }
        }

        Integer[] old_array = this.data;
        this.data = new Integer[index];
        System.arraycopy(old_array, 0, this.data, 0, index);

        return (origin_length > size()) ? true : false;
    }
}
