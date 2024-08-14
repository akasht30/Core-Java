class A {
  void hi(int c){
          System.out.println("Hello"+c);
  }
  void hi(String s){
    System.out.println("Hi"+s);
  }
  public static void main(String[] args){
    A a=new A();
    a.hi(10);
    a.hi("js");
  }
}
