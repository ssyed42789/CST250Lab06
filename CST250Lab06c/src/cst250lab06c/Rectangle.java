/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250lab06c;

/**
 *
 * @author ssyed
 */
public class Rectangle {
    
    int width;
    int height;
    
   public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    
}
   public void draw(){
       for (int i = 0; i < height; i++){
           for (int j = 0; j < width; j++){
               System.out.print("+");
               
           }
           System.out.println("");
       }
   }
}
   

