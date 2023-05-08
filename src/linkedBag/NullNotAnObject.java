/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedBag;

/**
 *
 * @author Duc Ta PLUS
 */
public class NullNotAnObject {

    public static void main(String[] args) {
        if (null instanceof Object) {
            System.out.println("Null is an Object!");
        } else {
            System.out.println("Null is NOT an Object!");
            System.out.println("But we can assign null to an object. A reference to nothing.");
            System.out.println("null is special.");
        }
    }
}

/* 
There is also a special null type, the type of the expression null, which has 
no name. Because the null type has no name, it is impossible to declare a 
variable of the null type or to cast to the null type. The null reference is 
the only possible value of an expression of null type. The null reference can 
always be cast to any reference type. In practice, the programmer can ignore 
the null type and just pretend that null is merely a special literal that can 
be of any reference type.
 */
