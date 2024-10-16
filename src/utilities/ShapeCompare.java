package utilities;

import java.util.Comparator;

import shapes.Shape;

public interface ShapeCompare extends Comparator<Shape>
{
	public int Compare(Shape shp1, Shape shp2);
}
