class Selection{
  public static void sort(int a[]){
    for(int i=0; i<a.length; i++){
      int minPos=i;
      for(int j=i+1; j<a.length; j++){
        if(a[minPos]>a[j]){
          minPos=j;
        }
      }
      int temp=a[minPos];
      a[minPos]=a[i];
      a[i]=temp;
    }
  }

  public static void print(int a[]){
    System.out.print("\nElements are: ");
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
    }
  }
  public static void main(String[] args) {
    int a[]={4,2,7,1,9,3,2};
    print(a);
    sort(a);
    print(a);
  }
}