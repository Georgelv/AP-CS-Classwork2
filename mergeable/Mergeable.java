/*
George Lyu
APCS 
Mr.Daniel
This program merges two arraylists.
 */
package mergeable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lvzhaozhou
 */
public interface Mergeable {

   Object merge (Object x);
    void printElements();
    int size();
    boolean elementOf(int x);
   
}
