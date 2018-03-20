/*
 George Lyu
 APCS
 Mr.Daniel
 This program merges two arraylists.
 */

package mergeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**

 */
public class IntegerSet implements Mergeable {
    public ArrayList<Integer>a;
    
    public IntegerSet(ArrayList<Integer>b){
        a=new ArrayList<Integer> (b);
    } 
 
    
    public int size(){
        return a.size();
        
    } 
    
    public boolean elementOf(int i){
        boolean c = false;
        for(int j =0;j<a.size();j++){
            if ((int) a.get(j)==i){
            c=true;
        }

    /**
     *
     */
    public void printElements(){
        for(int i =0; i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public Object merge (Object x){
        ArrayList<Integer>d=new ArrayList();
        d.addAll(a);
        d.addAll((Collection<? extends Integer>) x);
        return d;
    }
        
        public static void main(String[] args){
            List<Integer> c= new ArrayList();
          IntegerSet b = new IntegerSet(c);
          ArrayList<Integer> d = (ArrayList<Integer>) b.merge(c);
          b.printElements();
          System.out.println();
          for(int i=0;i<d.size();i++){
              System.out.println(d.get(i));
          }
          System.out.println("Size: " +b.size());
          System.out.println(b.elementOf(3));
        }
    }

