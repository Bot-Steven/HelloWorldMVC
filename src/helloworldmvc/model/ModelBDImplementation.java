/*test
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author steven,irkus
 */
public class ModelBDImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;

    private ResourceBundle bdFile;
    private String url, user, pass;

    private final String mostrarSaludo = "SELECT * FROM saludos";

    public void openConnection() {

        bdFile = ResourceBundle.getBundle("helloworldmvc.properties.bdconfig");
        url = bdFile.getString("Conn");
        user = bdFile.getString("DBUser");
        pass = bdFile.getString("DBPass");

        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la BD");
        }

    }

    public void closeConnection() throws ConnectException {

        if (stmt != null || con != null) {
            try {
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                throw new ConnectException("Error al cerrar con la base de datos");
            }
        }

    }

    @Override
    public String getGreeting() {

        ResultSet rs = null;
        String message = null;
        openConnection();

        try {

            stmt = con.prepareStatement(mostrarSaludo);
            rs = stmt.executeQuery();

            if (rs.next()) {
                message = rs.getString("Saludo");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            closeConnection();
        } catch (ConnectException ex) {
            ex.printStackTrace();
        }
        
        return message;
    }

}
