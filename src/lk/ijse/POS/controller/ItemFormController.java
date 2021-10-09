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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.POS.model.Item;

import java.sql.SQLException;

/**
 * @author Awanthi Shalika <awanthishali@gmail.com>
 * @since 10/9/2021
 */
public class ItemFormController {
    public TextField txtCode;
    public TextField txtDesc;
    public TextField txtUnitPrice;
    public TextField txtQtyOnHand;
    public Button btnSaveItem;

    public void btnSaveItemOnAction(ActionEvent actionEvent) {
        Item item=new Item(txtCode.getText(), txtDesc.getText(),Double.parseDouble(txtUnitPrice.getText()),Integer.parseInt(txtQtyOnHand.getText()));
        try {

            if (new ItemController().SaveCustomer(item))
                new Alert(Alert.AlertType.CONFIRMATION, "Saved").show();
            else
                new Alert(Alert.AlertType.WARNING, "Try Again").show();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
