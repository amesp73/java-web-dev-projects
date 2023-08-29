package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //FIELD VARIABLE
    private ArrayList<MenuItems> menuList;
    private Date date;

    //CONSTRUCTOR
    public Menu(ArrayList<MenuItems> menuList, Date date) {
        this.menuList = menuList;
        this.date = date;
    }

    //GETTERS AND SETTERS

    public ArrayList<MenuItems> getMenuList() {
        return menuList;
    }
    void setMenuList(ArrayList<MenuItems> menuList) {
        this.menuList = menuList;
    }
    public Date getDate() {
        return date;
    }
    void setDate(Date date) {
        this.date = date;
    }
}
