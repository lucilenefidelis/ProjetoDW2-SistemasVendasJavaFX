/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoweb.com.control;

import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 *
 * @author a140234x
 */
public abstract class MenuControl extends Application {
//Menu Bar
 MenuBar menuBar = new MenuBar();
 
 //Menu 1
 Menu vendas = new Menu("Vendas");
 
 //Menu Itens
 MenuItem itemNovo = MenuItem("Novo");

    private MenuItem MenuItem(String novo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
