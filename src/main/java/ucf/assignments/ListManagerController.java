package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ListManagerController implements Initializable {

    @FXML private TextField newListTextField;

    @FXML private TableView<ToDoList> toDoListTableView;

    @FXML private TableColumn<ToDoList, String> listNameColumn;

    @FXML private ObservableList<ToDoList> lists = FXCollections.observableArrayList();

    @FXML public void tableCellClickedOnce(MouseEvent mouseEvent) {
        //if the event is clicked once
            //create parent node and load the ToDoList.fxml from Resources
            //Initialize Scene and set Scene to show parent
            //Set stage
            //Set scene onto window
            //show the window
    }

    @FXML
    public void tableCellClickedTwice(TableColumn.CellEditEvent editCell) {
        //Set the selected item to an ToDoList object
        //call setter to revise the list Name with the editCell and set as string
    }


    @FXML
    public void createNewListButtonClicked(ActionEvent actionEvent) {
        //Initialize ToDoList with a new list
        //Call name setter and initialize with name text field
        //get all items in table as list and add the new list into table
        //create new directory to the list
    }

    @FXML
    public void saveAllListsButtonClicked(ActionEvent actionEvent) {
        //save current snapshot of observable list to JSON file
    }

    @FXML
    public void deleteListsButtonClicked(ActionEvent actionEvent) {
        //create ObservableList of type ToDoList for the selected rows
        //create Observable list of type ToDoList to contain the entire ToDoLists in table

        //get the rows that were selected

        //for loop over the selected rows
            //remove the ToDoList objects from the table
    }

    public ObservableList <ToDoList> getLists(){
        //return the data on the table as an observable list of ToDoLists
        return lists;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //load saved lists from files
        //set up table
        //load observableListItems to make list viewable
    }

    public void ObservableListItems(){
        //iterate through observable list
        //add the attributes of the ToDoLists object to list
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
        //allow for listName to be editable

        //allow for multiple selection
    }

    public void loadFromSavedFiles(){
        //read from JSON file
    }
}
