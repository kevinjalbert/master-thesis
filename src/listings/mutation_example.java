class Counter {
  Integer current = new Integer(1);
  Integer limit = new Integer(10);
  public Integer add() throws Exception {
    if (this.current > this.limit) {
      throw new Exception();
    }
    return ++this.current;
  }
}
