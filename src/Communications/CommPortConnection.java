/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Communications;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class CommPortConnection implements Connection{
    private ArrayList<FilterListener> filters = new ArrayList<FilterListener>();
    
    public void attachFilter(FilterListener newFilter) {
        filters.add(newFilter);
    }
    
    public void notify(byte[] msg) {
        for(FilterListener filter : filters) {
            filter.msgAvailable(msg);
        }
    }
}