/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZKprueba.controlador;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Textbox;

/**
 *
 * @author BRYAN
 */
public class Controlador1 extends GenericForwardComposer{
    Button aceptar, cambio;
    Intbox n1, n2;
    Textbox resultado;
    
    public void onClick$calcular(){
        int res = (n1.getValue() + n2.getValue());
        resultado.setValue(""+res);
       //Messagebox.show("Mensage en ZK");
    }
    
        public void onClick$cambio(){
            Executions.sendRedirect("/saludo1.zul");
    }
}
