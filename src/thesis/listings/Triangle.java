public class Triangle {

  public Boolean isValid(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0)
      return false;
    else if (a + b < c || a + c < b || b + c < a)
      return false;
    return true;
  }

  public TType classify(int a, int b, int c) {
    if (!isValid(a, b, c))
      return INVALID;

    int trian = 0;
    if (a == b)
      trian = trian + 1;
    if (a == c)
      trian = trian + 2;
    if (b == c)
      trian = trian + 3;

    if (trian > 3)
      return EQUILATERAL;
    else if (trian == 0)
      return SCALENE;
    else if (trian == 1 && a + b > c)
      return ISOSCELES;
    else if (trian == 2 && a + c > b)
      return ISOSCELES;
    else if (trian == 3 && b + c > a)
      return ISOSCELES;
    return INVALID;
  }
}
