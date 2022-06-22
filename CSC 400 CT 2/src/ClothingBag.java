public class ClothingBag {

    public static void main(String[] args) {
        // adding objects to the arraylist 
        BagInterface<SportsClothing> adtBag = new ItemBag<>();
        SportsClothing[] Clothing = new SportsClothing[11]; // reminder to change value for different testing len.
        Clothing[0] = new SportsClothing("Running Singlet ", 39.99 ,"RSIN12345");
        Clothing[1] = new SportsClothing("Split Running Shorts ", 29.99 ,"SRS123456");
        Clothing[2] = new SportsClothing("Runnning Socks ", 12.00, "RSOC12345");
        Clothing[3] = new SportsClothing("Cyling Jersey full zipper ", 79.99,"CJFZ12345");
        Clothing[4] = new SportsClothing("Cycling Bibs ", 159.99 ,"CB123456");
        Clothing[5] = new SportsClothing("Cycling Helmet ", 199.99, "CH123456");
        Clothing[6] = new SportsClothing("Running Shoes " , 78.95, "RSHOE12345");
        //Space for testing additional items 
        Clothing[7] = new SportsClothing("Racing flats " , 118.95, "RSF12345");
        Clothing[8] = new SportsClothing("Road Bike " , 2578.00, "RB12345");
        Clothing[9] = new SportsClothing("Cycling Shoes " , 165.95, "CSHOE12345");
        // Item 11 to test Exception errors 
        Clothing[10] = new SportsClothing("Workout Clothes " , 10.95, "WOCL12345");

        testAdd(adtBag, Clothing);
    }
    //Testing to make sure the bag works
    private static void testAdd(BagInterface<SportsClothing> adtBag,
                                SportsClothing[] content)
    {
        System.out.println("Here is your clothing and equipment " + content.length +
                " Items: ");
        for (int index = 0; index < content.length; index++)
        {
            if (adtBag.add(content[index]))
                System.out.println(content[index] + " ");
            else
                System.out.print("The bag is full  " + content[index] +  //error loop the bag is full
                        " can't be added to the bag.");
        }
        System.out.println();
        displayBag(adtBag);
    } // ending the  testAdd

    private static void displayBag(BagInterface<SportsClothing> adtBag)
    {
        System.out.println("The Clothing bags has these items:\n");
        Object[] bagArray = adtBag.toArray();
        for (int index = 0; index < bagArray.length; index++)
        {
            System.out.println(bagArray[index] + " ");
        } // end for
        System.out.println();
    } // end displayBag

}


