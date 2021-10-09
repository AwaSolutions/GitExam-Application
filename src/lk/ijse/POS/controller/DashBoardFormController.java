/*
 *
 *  * --------------------------------------------------------------------------------------------------
 *  * Copyright (c) AwaSolutions.All rights reserved.
 *  * Licensed under the Sri Lankan Information License. See LICENSE.txt in the project root for license.
 *  * ---------------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.POS.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Awanthi Shalika <awanthishali@gmail.com>
 * @since 10/9/2021
 */
public class DashBoardFormController {
    public Button btnSaveCustomer;
    public Button btnSaveItem;

    public void openSaveCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene= new Scene(FXMLLoader.load(getClass().getResource("../view/CustomerForm.fxml")));
        Stage primarystage= new Stage();
        primarystage.setScene(scene);
        primarystage.show();
    }

    public void openSaveItemrOnAction(ActionEvent actionEvent) {
    }
}
