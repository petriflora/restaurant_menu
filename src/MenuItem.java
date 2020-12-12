import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class MenuItem {

    private int itemID;
    private int nextItemId = 1;
    private String itemName;
    private double itemPrice;
    private String description;
    private String category;
    public String whenAddedToMenu;
    public LocalDate dateAddedToMenu;
    public double daysOnMenu;
    public boolean isNew;
    public String newMenuItem;
    String todayString = "2020-12-12";
    LocalDate todayDate = LocalDate.parse(todayString);

    public MenuItem(String itemName, int itemID, double itemPrice, String description, String category, String whenAddedToMenu) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.description = description;
        this.category = category;
        this.whenAddedToMenu = whenAddedToMenu;
        this.dateAddedToMenu = LocalDate.parse(whenAddedToMenu);
        this.daysOnMenu = ChronoUnit.DAYS.between(this.dateAddedToMenu,todayDate);
        this.isNew = calculateIsNew();
        this.newMenuItem = newMenuItem();
    }

    public boolean calculateIsNew(){
        if ( this.daysOnMenu >= 30.0) {
            return false;
        } else {
            return true;
        }
    }

    public String newMenuItem() {
        if(this.isNew == false) {
            return "CUSTOMER FAVORITE";
        } else {
            return "NEW MENU ITEM";
        }
    }

    @Override
    public String toString(){
        return '\n' + this.getItemID() + ": " + this.getItemName() + '\n' + "$" + this.getItemPrice() +
                '\n' + this.getDescription() +
                '\n' + this.newMenuItem + '\n';
    }

//    @Override
//    public boolean equals(Object toBeCompared) {
//        if(toBeCompared == this){
//            return true;
//        }
//        if (toBeCompared == null){
//            return false;
//        }
//        if (toBeCompared.getClass() != this.getClass()) {
//            return false;
//        }
//    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public void setPrice(double price) {
        this.itemPrice = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category.toLowerCase();
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAddedToMenu() { return dateAddedToMenu; }
    public void setDateAddedToMenu(String whenAddedToMenu) { this.dateAddedToMenu = LocalDate.parse(whenAddedToMenu); }

}
