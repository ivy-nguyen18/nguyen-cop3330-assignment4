package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class Item {

    private CheckBox isComplete;
    private SimpleStringProperty item;
    private SimpleStringProperty description;
    private LocalDate dueDate;

    public Item (CheckBox isComplete, String item, String description, LocalDate dueDate) {
        this.isComplete = isComplete;
        this.item = new SimpleStringProperty(item);
        this.description = new SimpleStringProperty(description);
        this.dueDate = dueDate;
    }

    public CheckBox isComplete() {
        return isComplete;
    }

    public void setComplete(CheckBox complete) {
        isComplete = complete;
    }

    public String getItem() {
        return item.get();
    }

    public SimpleStringProperty itemProperty() {
        return item;
    }

    public void setItem(String item) {
        this.item.set(item);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

}
