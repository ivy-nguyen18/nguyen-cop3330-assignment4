package ucf.assignments;

import com.google.gson.Gson;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ToDoListController {

    private ToDoList selectedList;

    //configure the table
    @FXML private TableView<Item> itemTableView;
    @FXML private TableColumn<Item, CheckBox> isCompletedColumn;
    @FXML private TableColumn<Item, String> itemNameColumn;
    @FXML private TableColumn<Item, String> descriptionColumn;
    @FXML private TableColumn<Item, LocalDate> dueDateColumn;

    //Instance variables to create new Item objects
    @FXML private CheckBox isComplete;
    @FXML private TextField itemNameTextField;
    @FXML private TextField descriptionTextField;
    @FXML private DatePicker dueDatePicker;

    @FXML private ObservableList<Item> itemObservableList;


    @FXML
    public void addItemButtonClicked(ActionEvent actionEvent) {
        //Create and initialize new item object
        //add the new item to the list of items in the table
    }

    @FXML
    public void deleteItemsButtonClicked(ActionEvent actionEvent) {
        //create ObservableList of type Item for the selected rows
        //create Observable list of type Item to contain the entire Item list of table

        //get the rows that were selected

        //for loop over the selected rows
            //remove the Item objects from the table
    }

    @FXML
    public void saveChangesButtonClicked(ActionEvent actionEvent) {
        //copy elements in ObservableList to ArrayList
        //serialize using java serialization
        //write to current list file
    }

    @FXML
    public void backToListManagerButtonClicked(ActionEvent actionEvent) {
        //if the event is clicked twice
            //create parent node and load the ListManager.fxml from Resources
            //Initialize Scene and set Scene to show parent
            //Set stage
            //Set scene onto window
            //show the window
    }

    @FXML
    public void viewCompletedOnlyClicked(ActionEvent actionEvent) {
        //create FilteredList and use lambda expression to set the predicate that for each Item, call isCompleted and compare to true
        //set itemTableView to completed FilteredList

    }

    @FXML
    public void viewUncompletedOnlyButtonClicked(ActionEvent actionEvent) {
        //create FilteredList and use lambda expression to set the predicate that for each Item, call isCompleted and compare to false
        //set itemTableView to not completed FilteredList
    }

    @FXML
    public void viewAllClicked(ActionEvent actionEvent) {
        //display observable list
    }

    public void initialize(){
        //set up table
        //load observableListItems to make list viewable
    }

    @FXML
    public void initData(ToDoList list){
        //make passed in list equal to selectedList
        //read in list file to load previous items
    }

    private void ObservableListItems(){
        //iterate through observable list
            //add the attributes of the Item object to list
        //set the table
    }

    private void initTable() {
        //call initColumns
    }

    private void initColumns() {
        //initialize columns in table to instance variables using setCellValueFactory
        //make columns editable
    }

    private void editColumns() {
        //set the table to be editable (true)
        //allow for due date to be editable
        //allow for description to be editable
        //allow for status to be editable

        //allow for multiple selection
    }

    private void editDueDate(){
        //make the DueDate column editable
        //go into the table, get the new changes and make it equal to dueDate setter
    }

    private void editDescription(){
        //make the Description column editable
        //go into the table, get the new changes and make it equal to description setter
    }

    private void editStatus(){
        //make the status column editable
        //go into the table, get the new changes and make it equal to status setter
    }

    private void dateConverter(){
        //set the String pattern to yyyy-MM-dd
        //set datePicker to the PromptText to get original format
        //setConverter for datePicker to new pattern using "nested" Override functions
            //initialize DateTimeFormatter using DateTimeFormatter.ofPattern function
            //override the toString method for LocalDate
                //if there a date is inputted
                    //return formatted date
                //else
                    //return empty string
            //override the fromString method for Strings
                //if the string is not empty
                    //parse the string into new pattern
                //if the string is empty
                    //return null
    }

    private void loadFromPrevious(){
        //read this list file
        //read into a list of type Item
        //copy list to current ObservableList
    }

}
