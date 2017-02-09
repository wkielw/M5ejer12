
package factorial_iterativo;

/**
 *
 * @author kimera
 */
public class iterativo {
   public int iterativo(){
   
      int n=4; //Es el numero a sacar su factorial
      int res=1; //Guardara el valor de la operacion en cada iteracion
 
      if(n==0 || n==1) //Se realizan los casos base si n es igual a 0 o 1 se imprime 1
         return 1;
 
      for(int i=2; i<=n; i++) //Se realiza la iteracion mientras i sea menor o igual a n se entrara al ciclo y se realizara la operacion ya despues se imprime el resultado del factorial
         res=res*i;
 
      return res;
   }
}
    
    
    

