/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers.Factory;

import Numbers.Exceptions.InvalidInput;

/**
 *
 * @author Petre Alexandru
 */
public interface FactoryInterface {
    
    public String makeString(int number) throws InvalidInput;
    
}
