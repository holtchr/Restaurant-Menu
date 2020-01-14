package restaurant;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {

    private String menuTitle;
    private ArrayList<MenuItem> appetizers;
    private ArrayList<MenuItem> mainCourses;
    private ArrayList<MenuItem> desserts;
    private LocalDateTime updatedDate;

    public Menu(String menuTitle, ArrayList<MenuItem> appetizers, ArrayList<MenuItem> mainCourses, ArrayList<MenuItem> desserts, LocalDateTime updatedDate) {
        this.menuTitle = menuTitle;
        this.appetizers = appetizers;
        this.mainCourses = mainCourses;
        this.desserts = desserts;
        this.updatedDate = LocalDateTime.now();
    }

    public String getMenuTitle() {
        return this.menuTitle;
    }
    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public ArrayList<MenuItem> getAppetizers() {
        return this.appetizers;
    }
    public void setAppetizers(ArrayList<MenuItem> appetizers) {
        this.appetizers = appetizers;
    }

    public ArrayList<MenuItem> getMainCourses() {
        return this.mainCourses;
    }
    public void setMainCourses(ArrayList<MenuItem> mainCourses) {
        this.mainCourses = mainCourses;
    }

    public ArrayList<MenuItem> getDesserts() {
        return this.desserts;
    }
    public void setDesserts(ArrayList<MenuItem> desserts) {
        this.desserts = desserts;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }
    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
