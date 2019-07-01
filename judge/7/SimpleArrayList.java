
public class SimpleArrayList {
    private Integer[] data;

    /**
     * Default constructor that initial array object.
     */
    public SimpleArrayList() {
        this(0);
    }

    /**
     * Constructor that can set initial array size, and set all Integer to zero in
     * this array.
     * 
     * @param size initial array size.
     */
    public SimpleArrayList(int size) {
        this.data = new Integer[size];

        // if array size is not zero, init all element to zero in this array.
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                this.data[i] = 0;
            }
        }
    }

    /**
     * Appends the specified {element} to the end of this array.
     * 
     * @param element specified element
     */
    public void add(Integer element) {
        Integer[] old_array = this.data;
        int len = size();
        this.data = new Integer[len + 1];
        System.arraycopy(old_array, 0, this.data, 0, len);
        this.data[len] = element;
    }

    /**
     * Getter for arraylist with specified {index}
     * 
     * @param index specified {index}
     * @return returns the element at the specified {index} in this array. If the
     *         specified {index} is out of range of the array, returns null.
     */
    public Integer get(int index) {
        if (index >= size()) {
            return null;
        }
        return this.data[index];
    }

    /**
     * Replaces the {element} at the specified {index} in this array
     * 
     * @param index   specified {index}
     * @param element specified {element}
     * @return the original element at that specified {index}. If the specified
     *         {index} is out of range of the array, returns null.
     */
    public Integer set(int index, Integer element) {
        if (index >= size()) {
            return null;
        }
        Integer origin = this.data[index];
        this.data[index] = element;
        return origin;
    }

    /**
     * Removes the {element} at the specified {index} in this array. Shifts any
     * subsequent elements to the left if removes succesfully.
     * 
     * @param index specified {index}
     * @return If a null element is at the specified {index}, returns false ;
     *         otherwise removes it and returns true.
     */
    public boolean remove(int index) {
        // check range.
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

    /**
     * Removes all of the elements from this array.
     */
    public void clear() {
        this.data = new Integer[0];
    }

    /**
     * Getter for size of this array
     * 
     * @return the number of elements in this array.
     */
    public int size() {
        return this.data.length;
    }

    /**
     * retains only the elements in this array that are contained in the specified
     * SimpleArrayList {l}. In other words, removes from this array all of its
     * elements that are not contained in the specified SimpleArrayList {l}.
     * 
     * @param l specified SimpleArrayList
     * @return Returns true if this array changed as a result.
     */
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
