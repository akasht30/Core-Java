class A{
  int b;//global 
  A(int b){ //here b is local
    this.b=b;//this means current object refers current object members, reintializing global by local
  }
}
class Main{
  public static void main(String[] args){
    A a=new A(10);
    System.out.println(a.b);// we intialized local variable and printing by constructor 
  }
}
  
