/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.simuduck.behavior.fly.impl;

import com.zisal.simuduck.behavior.fly.IFly;

/**
 *
 * @author Ladies Man
 */
public class FlyAble implements IFly{

    @Override
    public void fly() {
        System.out.println("I can fly with my wings");
    }
    
}
