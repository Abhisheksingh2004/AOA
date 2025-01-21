class Main{
    public static void sortInsert(int a[]){
        for(int i=1;i<a.length;i++){
            int x=a[i];
            int j=i;
            while(j>0 && a[j-1]>x){
                a[j]=a[j-1];
                j--;
                a[j]=x;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
        public static void main(String[] args) {
        int a[]={1,4,3,2,5};
        sortInsert(a);
    }
}
