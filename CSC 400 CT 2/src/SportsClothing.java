public class SportsClothing {
    private String itemName;
    private double price;
    private String sku; //item identifier in the event there are ex. 2 running shorts with different size and color
    
    public SportsClothing (String itemName, double price, String sku)
    {
        this.itemName = itemName;
        this.price = price;
        this.sku = sku;
    }
    public String getItemName()
    {
        return this.itemName;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getSku()
    {
        return this.sku;
    }
    @Override
    public String toString()
    {
        return this.itemName + " $" + this.price + " SKU:" + this.sku + "\n";

    }
}