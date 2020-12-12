import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem appetizer1 = new MenuItem("Charcuterie and Cheese Plate",1,12.99,"This lovely selection of locally sourced cheese, meats, and pickled vegetables is delicious with the Pinot Noir.","Appetizer","2020-12-11");
        MenuItem appetizer2 = new MenuItem("Bread basket",2,3.99,"This selection of breads baked with heritage grains is accompanied by hand-churned butter.","Appetizer","2020-04-01");
        MenuItem mainCourse1 = new MenuItem("Meatloaf Sandwich",3,18.99,"Meatloaf just like Grandma used to make it, topped with mashed potatoes on big slabs of Farmhouse White bread.", "Main Course","2020-11-01");
        MenuItem mainCourse2 = new MenuItem("Salmon Florentine",4,21.99,"Salmon on a bed of spinach, served with couscous and balsamic vinegar reduction.","Main Course","2020-08-15");
        MenuItem dessert1 = new MenuItem("All.The.Chocolate",5,8.99,"Chocolate. Just chocolate. For your sanity.","Dessert","2020-01-01");

//        System.out.println(appetizer1);
//        System.out.println(appetizer2);

        Menu restaurantMenu = new Menu();
        restaurantMenu.addItemToMenu(appetizer1);
        restaurantMenu.addItemToMenu(appetizer2);
        restaurantMenu.addItemToMenu(mainCourse1);
        restaurantMenu.addItemToMenu(mainCourse2);
        restaurantMenu.addItemToMenu(dessert1);

//        Menu.printEntireMenu(restaurantMenu.menuItems);
//        Menu.printAppetizers(restaurantMenu.menuItems);
//        Menu.printMainCourses(restaurantMenu.menuItems);
//        Menu.printDesserts(restaurantMenu.menuItems);

//        restaurantMenu.removeItemFromMenu(appetizer1);
//        Menu.printEntireMenu(restaurantMenu.menuItems);

    }





}
//instantiate instances of menu item classes and menu