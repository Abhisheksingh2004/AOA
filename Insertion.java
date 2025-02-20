class Insertion {

  public static void sort(int a[]){
    for(int i=1; i<a.length; i++){
      int curr=a[i];
      int prev=i-1;
      while(prev>=0 && a[prev]>curr){
        a[prev+1]=a[prev];
        prev--;
      }
      a[prev+1]=curr;
    }
  }

  public static void print(int a[]){
    System.out.print("\nElements are: ");
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
    }
  }
  
  public static void main(String[] args) {
    int a[]={9,10,23,56,7,33};
    print(a);
    sort(a);
    print(a);
  }
}
