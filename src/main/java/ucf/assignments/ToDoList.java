package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Item> itemsArrayList;

    private SimpleStringProperty listName;

    public String getListName() {
        return listName.get();
    }

    public SimpleStringProperty listNameProperty() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName.set(listName);
    }



}
