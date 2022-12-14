package com.tms.figure.model;

import com.tms.figure.services.IFigure;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Rectangle extends Figure implements IFigure {
    private double length;
    private double weight;

    public Rectangle(FigureType figureType, double length, double weight) {
        super(figureType);
        this.length = length;
        this.weight = weight;
    }

    @Override
    public double getSquare() {
        return length * weight;
    }
}
