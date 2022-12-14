package com.tms.figure.services;

import com.tms.figure.model.*;

public class Main {
    public static void main(String[] args) {
        Figure line = new Line(FigureType.LINE, 1.0);
        Figure triangle = new Triangle(FigureType.TRIANGLE, 3.0, 2.0);
        Figure rectangle = new Rectangle(FigureType.RECTANGLE, 4.0, 2.5);
        Figure[] figures = {line, triangle, rectangle};
        for (Figure figure : figures) {
            if (figure.getFigureType() != FigureType.LINE) {
                System.out.println(((IFigure) figure).getSquare());
            }
        }
    }
}
