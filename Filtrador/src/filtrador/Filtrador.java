
package filtrador;

import javax.swing.JOptionPane;

public class Filtrador {

    public static void main(String[] args) {
    int i=1;
    int positivo=0,negativo=0,neutro=0;
    String num;
    double num2;
    while(i<21){
        num=JOptionPane.showInputDialog("Ingrese el numero "+i);
        int j=0;
        while(j<3){
            if(num.matches("[(-9)-0-9]*")){
               
               break;
            }else
            {
                num=JOptionPane.showInputDialog("Vuelva a ingresar el numero "+i);
            }
        }
        
        num2=Double.parseDouble(num);
            if(num2<0){
                negativo=negativo+1;
            }else{
                if(num2==0){
                    neutro++;
                }else{
                    positivo++;
                }
                
                
            }
            i++;
            
        }
    JOptionPane.showMessageDialog(null,"Los numeros positivos son: "+positivo+
            "\nLos numeros negativos son: "+negativo+
            "\nLos numeros neutros son: "+neutro);
    }
    
    
}
