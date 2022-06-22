public class ItemBag<T> implements BagInterface<T>
{
    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 10; //10 item for testing can be larger if needed
    private boolean initialized = false;

    public ItemBag()
    {
        this(DEFAULT_CAPACITY);
    }

    
    public ItemBag(int capacity) {
        if (capacity <= DEFAULT_CAPACITY){
            @SuppressWarnings("unchecked") //Suppressing the warning for the default bag
            T[] tempBag = (T[])new Object[DEFAULT_CAPACITY];
            bag = tempBag;
            numberOfEntries = 0;
            initialized = true;
    }
        else 
             throw new IllegalStateException("\nAttempting to create a bag when it is already full\n");
    }
    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked") //the cast is safe beacause the new array contians null entires
        T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
        for (int index = 0; index < numberOfEntries; index++)
        {
            result[index] = bag[index];
        }
        return result;
    }
    @Override
    public boolean add(T newEntry) { // Adding the ClothingItem to the Bag
        if (initialized){
        boolean result = true;
        if (isArrayFull())
        {
            result = false;
        }
        else
        { // Assertion: result is true here
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        } // end if

        return result;
    }
    else 
        throw new SecurityException("\nArray ItemBag is not working properly\n");
    }    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    // Returns true if the array bag is full, or false if not.
    private boolean isArrayFull()
    {
        return numberOfEntries >= bag.length;
    } // end isArrayFull

}
