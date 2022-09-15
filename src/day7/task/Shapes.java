package day7.task;

public class Shapes {


    //1. Area of rectangle. ->  A = l x b
    //2. Area of circle. -> a = pi x r^2
    //3. Volume of a rectangle -> length x width x height
    //4. Volume of sphere. -> 4/3 pi x r^3

    final double pi = 3.14;

    double areaOfRectangle (double length, double height) {
        return length * height;
    }
    double areaOfCircle (double radius) {
        return pi * (Math.pow(radius, 2));
    }

    double volumeOfRectangle (double lenght, double width, double height) {
        return lenght * width * height;
    }

    double volumeOfSphere (double radius) {
        return (4 / 3 * pi) * (Math.pow(radius, 3));
    }

}
