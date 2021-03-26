package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNum newComplexNum(int a, int b) {
        return new ComplexNum(a, b);
    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(a + num.a, b + num.b);
    }
//  return new ComplexNum(a + num.a, b + num.b);
    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(a - num.a, b - num.b);
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum((a * num.a) - (b * num.b), (b * num.a) + (a * num.b));
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum((a * num.a + b * num.b) / (num.a * num.a + num.b * num.b),
                (b * num.a - a * num.b) / (num.a * num.a + num.b * num.b));
    }
   /* public ComplexNum add(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a + num2.a, num1.b + num2.b);
    }

    public ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a - num2.a, num1.b - num2.b);
    }
   public ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum(a * c - b * d, b * c + a * d);
    }

    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
    }*/

    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(2, 2);
        ComplexNum b = new ComplexNum(1, 1);
        System.out.println(new ComplexNum(1000, 1000).add(new ComplexNum(100, 100)).toString());
        System.out.println(new ComplexNum(1000, 1000).sub(new ComplexNum(100, 100)).toString());
        System.out.println(new ComplexNum(1000, 1000).mul(new ComplexNum(100, 100)).toString());
        System.out.println(new ComplexNum(1000, 1000).div(new ComplexNum(100, 100)).toString());
        //System.out.println(a.add(a, b));
        //System.out.println(a.sub(a, b));
       //System.out.println(a.mul(a, b));
        //System.out.println(a.div(a, b));
    }
}