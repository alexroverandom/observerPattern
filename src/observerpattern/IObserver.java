/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observerpattern;

/**
 *
 * @author alexroverandom
 */
public interface IObserver {
    public void update(float latitude, 
                        float longitude, 
                        float speed, 
                        float direction);
}
