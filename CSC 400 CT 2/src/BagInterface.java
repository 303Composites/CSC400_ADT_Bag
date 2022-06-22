public interface BagInterface<T>
{
    public int getCurrentSize(); //shows the current size

    public boolean add(T newEntry);

    // Shows all of the entires
   public T[] toArray();
}