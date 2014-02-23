/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploLeerFecha;

/**
 *
 * @author mario
 */
public class ObjetoFecha {
    public String dia, mes, año;
    public String[] array = new String[3];
    ObjetoFecha(String fecha) {
        array = fecha.split("/");
        dia = array[0];
        mes = array[1];
        año = array[2];
    }
    
    public String getFecha() {
        return this.dia+"/"+this.mes+"/"+this.año;
    }
}
