class pyramid{
    public static void main1(){
        System.out.println(" \n\n\n************************* 1st program ****************");

        for(int i=0;i<10;i++){
        System.out.println("helloooooo world ");



        }
    } 
    public static void main2(){
        System.out.println(" \n\n\n*************************Finding odd even number ****************");

        for(int i=1;i<=3;i++){

            if(i%2==0){
                System.out.println("The the "+ i +" is even");
                System.out.println();
            }
            else {
                System.out.println("The " + i +" is odd ");
                System.out.println();
            }

            
        }
    }
    public static void main3(){
        System.out.println(" \n\n\n*************************Finding odd even number ****************");
        int a=10000000;


        if (a%2==0 ){
            System.out.println("the given number is even ");
        }
        else {
            System.out.println("the given number is odd  ");
        }
    }
    public static void main(){
        
    }
    public static void main(String [] args ){
        System.out.println(" \n\n\n*************************printing the pyramid  ****************");

        int n=5,s=5;
        for(int i=1;i<=n;i++){


            for(int j=1;j<=s-i;j++){
                System.out.print(" ");
            }


            for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();


        }
        main1();
        main2();
        main3();
    }

}   


