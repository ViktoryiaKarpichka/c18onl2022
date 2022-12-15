package com.tms.figure.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Line extends Figure {
    private double length;

    public Line(FigureType figureType, double length) {
        super(figureType);
        this.length = length;
    }
}
