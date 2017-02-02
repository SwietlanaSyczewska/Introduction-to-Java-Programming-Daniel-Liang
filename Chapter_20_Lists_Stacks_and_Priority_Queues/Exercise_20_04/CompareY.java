package Exercise_20_04;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {
		if (p1.getY() == p2.getY()) {
			if (p1.getX() > p2.getY()) {
				return 1;
			} else if (p1.getX() < p2.getY()) {
				return -1;
			} else {
				return 0;
			}
		} else if (p1.getY() > p2.getY()) {
			return 1;
		} else {
			return -1;
		}
	}

}
