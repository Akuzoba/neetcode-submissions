class DynamicArray {
    int count;
    int[] items;
    int size;
    public DynamicArray(int capacity) {
        size = capacity;
         items = new int[capacity];
    }

    public int get(int i) {
        return items[i];
    }

    public void set(int i, int n) {
        items[i] = n;
    }

    public void pushback(int n) {
        if(count  == size){
            resize();
        }
        items[count++] = n;
    }

    public int popback() {
        return items[--count];
    }

    private void resize() {
        int[] Newitems = new int[size * 2];
        for(int i=0;i<count;i++){
            Newitems[i] = items[i];
        }
        items = Newitems;
        size = size*2;
    }

    public int getSize() {
        return count;
    }

    public int getCapacity() {
        return size;
    }
}
