/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLIDExamples;

/**
 *
 * @author mauricio.moreira
 */
interface TriangleDraw {
    public void drawTriangle();
}
interface CircleDraw {
    public void drawCircle();
}
interface SquareDraw {
    public void drawSquare();
}

class Triagle implements TriangleDraw {
    @Override
    public void drawTriangle() {
        System.out.println("Drawing a triangle");
    }
}

class Square implements SquareDraw {
    @Override
    public void drawSquare() {
        System.out.println("Drawing a square");
    }
}

class Circle implements CircleDraw {
    @Override
    public void drawCircle() {
        System.out.println("Drawing a circle");
    }
}


public class GoodISPExample {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.drawTriangle();
    }
}
