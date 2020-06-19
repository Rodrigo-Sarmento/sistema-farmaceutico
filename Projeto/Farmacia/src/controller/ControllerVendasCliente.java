
package controller;

import DAO.DAOVendasCliente;
import java.util.ArrayList;
import model.ModelVendasCliente;

/**
 *
 * @author Rodrigo Sarmento
 */
public class ControllerVendasCliente {
    
    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();

    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClienteDAO();
    }
    
}
