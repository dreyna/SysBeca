/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.interfaces;

import java.util.List;
import pe.edu.upeu.sysbeca.model.Distrito;

/**
 *
 * @author alum.fial8
 */
public interface DistritoInterface {
    public List<Distrito> listarDistrito();
    public boolean registrarDistrito(Distrito d);
}
