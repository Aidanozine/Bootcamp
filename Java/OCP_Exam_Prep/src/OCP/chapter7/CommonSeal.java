/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class CommonSeal extends HarborSeal {
    public int getTailLength(){
        return 0;
    }
    
    public int getWhiskersNum(){
        return 0;
    }
}

interface HasTail {

    public int getTailLength();
}

interface HasWhiskers {

    public int getWhiskersNum();
}

abstract class HarborSeal implements HasTail, HasWhiskers {

}
