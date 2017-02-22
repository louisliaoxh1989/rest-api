package com.supermy.designpatterns.state;

import java.awt.*;

/**
 * Created by moyong on 17/2/22.
 */
public class BlackState extends State{

    public void handlepush(Context c){
         //根据push方法"如果是blue状态的切换到green" ;
         c.setState(new RedState());

        }
    public void handlepull(Context c){

         //根据pull方法"如果是blue状态的切换到red" ;
        c.setState(new GreenState());

        }

    public  Color getcolor(){ return Color.black;}

}
