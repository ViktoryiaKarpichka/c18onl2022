package com.tms.figure.model;

import com.tms.figure.services.IFigure;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Triangle extends Figure implements IFigure {
    private double height;
    private double base;

    public Triangle(FigureType figureType, double height, double base) {
        super(figureType);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getSquare() {
        return base * height / 2;
    }
}
