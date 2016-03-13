/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers.Exceptions;

/**
 *
 * @author Petre Alexandru
 */
public class InvalidInput extends Exception {

    /**
     * Creates a new instance of <code>InvalidInput</code> without detail
     * message.
     */
    public InvalidInput() {
    }

    /**
     * Constructs an instance of <code>InvalidInput</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidInput(String msg) {
        super(msg);
    }
}
