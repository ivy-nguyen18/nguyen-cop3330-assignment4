package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Item> itemsArrayList;
    private SimpleStringProperty listName;
    private Path pathToList;
    private File itemsFile;

    public ArrayList<Item> getItemsArrayList() {
        return itemsArrayList;
    }

    public void setItemsArrayList(ArrayList<Item> itemsArrayList) {
        this.itemsArrayList = itemsArrayList;
    }

    public Path getPathToList() {
        return pathToList;
    }

    public void setPathToList(Path pathToList) {
        this.pathToList = pathToList;
    }

    public File getItemsFile() {
        return itemsFile;
    }

    public void setItemsFile(File itemsFile) {
        this.itemsFile = itemsFile;
    }

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
