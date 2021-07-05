/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ivy Nguyen
 */
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
import java.util.List;
import java.util.ResourceBundle;

public class ListManagerController {

    @FXML private TextField newListTextField;

    @FXML private TableView<ToDoList> toDoListTableView;

    @FXML private TableColumn<ToDoList, String> listNameColumn;

    @FXML private ObservableList<ToDoList> lists = FXCollections.observableArrayList();

    @FXML public void openListScene(MouseEvent mouseEvent) {
        //if the event is clicked once
            //create new FXMLLoader object
            //set the loader location to ToDoList.fxml
            //create parent node and load the loader
            //Initialize Scene and set Scene to show parent
            //initialize ToDoListController and use loader to get the controller
            //using controller object, call init data and get the selected ToDoList from the table
            //Set stage
            //Set scene onto stage
            //set stage to show
    }

    @FXML
    public void editCell(TableColumn.CellEditEvent editCell) {
        //Set the selected item to an ToDoList object
        //set new edited cell name to a string
        //call changeListName
    }


    @FXML
    public void createNewListButtonClicked(ActionEvent actionEvent) {
        //call createNewList
    }

    @FXML
    public void saveAllListsButtonClicked(ActionEvent actionEvent) {
        //call saveAllLists
    }

    @FXML
    public void deleteListsButtonClicked(ActionEvent actionEvent) {
        //create ObservableList of type ToDoList for the selected rows
        //get the rows that were selected
        //call deleteLists
    }

    public ObservableList <ToDoList> getLists(){
        //return the data on the table as an observable list of ToDoLists
        return lists;
    }


    public void initialize() {
        //load saved lists from files
        //set up table
        //make table editable (true)
        //load observableListItems to make list viewable
    }

    private void changeListName(String oldListName){
        //call setter to revise the list Name
    }

    private void saveAlLists(){
        //copy elements in ObservableList to ArrayList
        //serialize using java serialization
        //write to current List Manager file
    }

    private void deleteLists(ObservableList<ToDoList> deleteLists){
        //create Observable list of type ToDoList to contain the entire ToDoLists in table

        //for loop over the selected rows
            //remove the ToDoList objects from the table
            //call deleteDirectoryOfList
    }

    private void deleteDirectoryOfList(String folderName){
        //finds the directory of where folder is located
        //deletes folder
    }


    private void observableListItems(){
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

    private void loadFromPrevious(){
        //read current file
        //read into a list of type ToDoList
        //copy list to current ObservableList
    }

    private void makeNewDirectory(ToDoList list){
        //make a directory with the new folder name in directory ListManager
    }

    private void makeSerializationFile(ToDoList list){
        //create empty serialization file in list object
    }

    private void makeRootDirectory(){
        //if size of observableList = 0
            //create a root directory called ListManager to store all the ToDoLists
    }

    private void createNewList(){
        //call makeRootDirectory
        //Initialize ToDoList with a new list
        //Call name setter and initialize with name text field
        //get all items in table as list and add the new list into table
        //create new directory to the list
        //create empty serialization file
    }

}
