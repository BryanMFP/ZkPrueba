/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZKprueba.controlador;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

/**
 *
 * @author BRYAN
 */
public class Modal1 extends GenericForwardComposer {

    Window modalDialog;
    Button closeBtn;

    public void onClick$closeBtn() {
        modalDialog.detach();
    }
}
