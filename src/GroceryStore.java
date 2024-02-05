import java.util.ArrayList;
import java.util.Arrays;

public class GroceryStore {
    /** An array of products normally stocked at the grocery store
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private Product[] productsStocked;

    public GroceryStore(Product[] initialInventory) {
        productsStocked = initialInventory;
    }

    /** Returns an ArrayList of indices for Product elements in the
     *  productsStocked array that need to be reordered, as described in part (a)
     *  Precondition: min > 0 */
    public ArrayList<Integer> getReorderList(int min) {
        /* to be implemented in part (a) */
        ArrayList<Integer> restock = new ArrayList<Integer>();
        for (int i = 0; i < productsStocked.length; i++) {
            if (productsStocked[i].getQuantity() <= min) {
                restock.add(i);
            }
        }
        return restock;
    }

    /** Returns true if all products named in shoppingList are available for purchase
     *  and returns false otherwise, as described in part (b)
     *  Precondition: The products named in shoppingList are found exactly once
     *  in the productsStocked array.
     */
    public boolean checkAvailability(ArrayList<String> shoppingList) {
        /* to be implemented in part (b) */
        for (int i = 0; i < shoppingList.size(); i++) {
            String name1 = shoppingList.get(i);
            for (int f = 0; f < productsStocked.length; f++) {
                String name2 = productsStocked[f].getName();
                if (name1.equals(name2)) {
                    if (productsStocked[f].getQuantity() < 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
