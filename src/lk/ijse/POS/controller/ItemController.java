/*
 *
 *  * --------------------------------------------------------------------------------------------------
 *  * Copyright (c) AwaSolutions.All rights reserved.
 *  * Licensed under the Sri Lankan Information License. See LICENSE.txt in the project root for license.
 *  * ---------------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.POS.controller;

import lk.ijse.POS.db.DBConnection;
import lk.ijse.POS.model.Item;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Awanthi Shalika <awanthishali@gmail.com>
 * @since 10/9/2021
 */
public class ItemController {
    public boolean SaveCustomer(Item c) throws SQLException, ClassNotFoundException {
        Connection connection= DBConnection.getInstance().getConnection();
        String query = "INSERT INTO Item VALUES ('"+c.getCode()+ "','"+c.getDescription()+"','"+c.getUnitPrice()+"','"+c.getQtyOnHand()+"')";
        Statement stm= connection.createStatement();
        return stm.executeUpdate(query)>0;

    }
}
