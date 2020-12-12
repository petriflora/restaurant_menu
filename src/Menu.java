import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Menu {

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    String todayString = "2020-12-12";
    LocalDate todayDate = LocalDate.parse(todayString);
    LocalDate mostRecentUpdated;
//    long daysSinceUpdate = ChronoUnit.DAYS.between(mostRecentUpdated,todayDate);

    public void addItemToMenu(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeItemFromMenu(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    public static void printEntireMenu(ArrayList<MenuItem> menuItems) {
        System.out.println("RESTAURANT MENU");
        System.out.println('\n' +"****************" + '\n');
        menuItems.forEach(menuItem -> {
            System.out.println('\n' + menuItem.getItemID() + ": " + menuItem.getItemName() + '\n' + "$" + menuItem.getItemPrice() +
                    '\n' + menuItem.getDescription() +
                    '\n' + menuItem.newMenuItem + '\n');
        });
    }

    public static void printAppetizers(ArrayList<MenuItem> menuItems) {
        System.out.println("APPETIZERS");
        System.out.println('\n' +"****************" + '\n');
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getCategory().contains("appetizer")){
                System.out.println('\n' + menuItem.getItemID() + ": " + menuItem.getItemName() + '\n' + "$" + menuItem.getItemPrice() +
                        '\n' + menuItem.getDescription() +
                        '\n' + menuItem.newMenuItem + '\n');
            }
        }
    }

    public static void printMainCourses(ArrayList<MenuItem> menuItems) {
        System.out.println("MAIN COURSES");
        System.out.println('\n' +"****************" + '\n');
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getCategory().contains("main course")) {
                System.out.println('\n' + menuItem.getItemID() + ": " + menuItem.getItemName() + '\n' + "$" + menuItem.getItemPrice() +
                        '\n' + menuItem.getDescription() +
                        '\n' + menuItem.newMenuItem + '\n');
            }
        }
    }

    public static void printDesserts(ArrayList<MenuItem> menuItems) {
        System.out.println("YOU'LL GET YOUR JUST DESSERTS");
        System.out.println('\n' +"****************" + '\n');
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getCategory().contains("dessert")) {
                System.out.println('\n' + menuItem.getItemID() + ": " + menuItem.getItemName() + '\n' + "$" + menuItem.getItemPrice() +
                        '\n' + menuItem.getDescription() +
                        '\n' + menuItem.newMenuItem + '\n');
            }
        }
    }

    public LocalDate calculateLastDateUpdate() {
        LocalDate mostRecentDate = LocalDate.parse("20190101");
        for (MenuItem menuItem : menuItems) {
            if (ChronoUnit.DAYS.between(menuItem.dateAddedToMenu,todayDate) <= 30) {
                mostRecentDate = menuItem.dateAddedToMenu;
            } else if (ChronoUnit.DAYS.between(menuItem.dateAddedToMenu,todayDate) <= 60){
                mostRecentDate = menuItem.dateAddedToMenu;
            } else if (ChronoUnit.DAYS.between(menuItem.dateAddedToMenu,todayDate) <= 90){
                mostRecentDate = menuItem.dateAddedToMenu;
            } else if (ChronoUnit.DAYS.between(menuItem.dateAddedToMenu,todayDate) <= 180){
                mostRecentDate = menuItem.dateAddedToMenu;
            }
        } System.out.println(mostRecentDate);
        return mostRecentDate;

    }


//    public printSelected() {
//
//    }
//    public printAll() {
//
//    }
//     isEqual()



}
