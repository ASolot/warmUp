/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers.Factory;

import Numbers.Factory.FactoryInterface;
import Numbers.Exceptions.InvalidInput;

/**
 *
 * @author Petre Alexandru
 */
public class UnitsFactory implements FactoryInterface{
    
    @Override
    public String makeString(int i) throws InvalidInput{
        switch(i){
            case 0 : return "";
            case 1 : return "unu";
            case 2 : return "doi";
            case 3 : return "trei";
            case 4 : return "patru";
            case 5 : return "cinci";
            case 6 : return "sase";
            case 7 : return "sapte";
            case 8 : return "opt";
            case 9 : return "noua";
            default : throw new InvalidInput("Not a unit: " + i + " !");
        }
    }
    
}
