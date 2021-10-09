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
import lk.ijse.POS.model.Customer;

import java.sql.SQLException;

/**
 * @author Awanthi Shalika <awanthishali@gmail.com>
 * @since 10/9/2021
 */
public class CustomerFormController {
    public TextField txtCustID;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;
    public Button btnSaveCustomer;

    public void btnSaveCustomerOnAction(ActionEvent actionEvent) {
        Customer customer=new Customer(txtCustID.getText(), txtName.getText(),txtAddress.getText(),Double.parseDouble(txtSalary.getText()));
        try {

            if (new CustomerController().SaveCustomer(customer))
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
