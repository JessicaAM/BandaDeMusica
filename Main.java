package bandademusica;

/**
 *
 * @author Jessica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        instrumentos [] a = new instrumentos[5];
        a[0] = new flauta();
        a[0].tocar('A');
        a[1] = new cuerda();
        a[1].tocar('B');
        a[2] = new Percusion();
        a[2].tocar('C');
        
    }
    
}
