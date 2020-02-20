/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.housing;

/**
 *
 * @author HP
 */
public class Pricing {
public enum material{standard,above_standard,high_standard};
public static int calPrice(String mat,int total_area,boolean auto)
{
mat=mat.replace(' ','_');
int arr[]={1200,1500,1800,2500};
int k=material.valueOf(mat).ordinal();
if(k==2 && auto==true)
    return total_area*arr[k];
else
    return total_area*2500;
}
}
