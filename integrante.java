package bandademusica;

/**
 *
 * @author Jessica
 */
public class integrante {
    instrumentos mis_instrumentos;
    public integrante(instrumentos I){
        mis_instrumentos = I;
    }
    public void TocarInstrumento(){
        mis_instrumentos.tocar('C');
    }
    public void CambiarInstrumento(instrumentos I){
        mis_instrumentos = I;
    }
}
