/*
 * CopyRight 2014 - Geeky Theory
 * Please, read the LICENSE file for more details.
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
