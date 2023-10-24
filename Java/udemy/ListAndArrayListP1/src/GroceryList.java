import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("Grocery List has "+groceryList.size()+" Items");
        for(int i=0;i<groceryList.size();i++) {
            System.out.println(i+1+"."+groceryList.get(i));
        }
    }
    public void modifyGroceryList(int position, String item) {
        groceryList.set(position,item);
    }
    public void removeElement(int position) {
        String element = groceryList.get(position);
        groceryList.remove(position);
    }
}
