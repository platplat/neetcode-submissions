class DynamicArray {
    private int[] array;
    private int currentIndex;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.currentIndex = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.currentIndex < this.array.length) {
            this.array[this.currentIndex] = n;
        } else {
            this.resize();
            this.array[this.currentIndex] = n;
        }
        this.currentIndex++;
    }

    public int popback() {
        int lastIndex = this.currentIndex - 1;
        int lastElement = this.array[lastIndex];
        int[] newArray = new int[lastIndex];
        System.arraycopy(this.array, 0, newArray, 0, lastIndex);
        this.currentIndex--;
        return lastElement;
    }

    private void resize() {
        int[] newArray = new int[this.array.length * 2];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        this.array = newArray;
    }

    public int getSize() {
        return this.currentIndex;
    }

    public int getCapacity() {
        return this.array.length;
    }
}
