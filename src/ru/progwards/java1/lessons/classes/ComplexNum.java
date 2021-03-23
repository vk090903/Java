package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    int a; // действительная часть
    int b; // мнимая часть

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

    // сложение комплексных чисел по формуле: (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a + num2.a, num1.b + num2.b);
    }
    // вычитание комплексных чисел по формуле: (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a - num2.a, num1.b - num2.b);
    }
    // умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum(a * c - b * d, b * c + a * d);
    }
    // деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }

    // tests
    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(2, 2);
        ComplexNum b = new ComplexNum(1, 1);
        System.out.println(a.add(a, b));
        System.out.println(a.sub(a, b));
        System.out.println(a.mul(a, b));
        System.out.println(a.div(a, b));
    }
}