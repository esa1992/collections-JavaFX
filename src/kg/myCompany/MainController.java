package kg.myCompany;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import kg.myCompany.models.ListNames;

public class MainController {

    ListNames names = new ListNames();

    @FXML
    private TextField txtName;

    @FXML
    private Button btnAddName;

    @FXML
    private Button btnShowAllNames;

    @FXML
    private ListView<String> listView;

    @FXML
    void onBtnClick(ActionEvent event) {

        if (event.getSource().equals(btnAddName)){

            names.addNamesInList(txtName.getText());
            txtName.setText("");

        }else if(event.getSource().equals(btnShowAllNames)){
            //System.out.println(names.getNamesList());
            if (names.getNamesList() != null) {
                ObservableList<String> observableList = FXCollections.observableList(names.getNamesList());
                listView.setItems(observableList);
                listView.refresh();
            }else{

                Alert alert = new Alert(Alert.AlertType.ERROR, "Список имен меньше 10 шт. Добавьте ещё имена!"
                        , ButtonType.OK);
                alert.setHeaderText(null);
                alert.setTitle("Ошибка");
                alert.show();

            }

        }

    }
}
