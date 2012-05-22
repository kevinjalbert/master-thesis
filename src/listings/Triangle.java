public class Triangle {

  public TType classify(int a, int b, int c) {
    int tri;
    if (a <= 0 || b <= 0 || c <= 0)
      return INVALID;
    tri = 0;

    if (a == b)
      tri = tri + 1;
    if (a == c)
      tri = tri + 2;
    if (b == c)
      tri = tri + 3;
    if (tri > 3)
      return EQUILATERAL;

    if (tri == 0)
      if (a + b < c || a + c < b || b + c < a)
        return INVALID;
      else
        return SCALENE;

    if (tri == 1 && a + b > c)
      return ISOSCELES;
    else if (tri == 2 && a + c > b)
      return ISOSCELES;
    else if (tri == 3 && b + c > a)
      return ISOSCELES;
    return INVALID;
  }
}
