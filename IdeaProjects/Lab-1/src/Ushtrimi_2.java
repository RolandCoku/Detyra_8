/*
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\

*/
public class Ushtrimi_2 {

    public static void main(String[] args){
        printBase(5);
    }
    public static void printBase(int n){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<=n; j++){
                if (i+j<n-1){
                    System.out.print(" ");
                } else if (j==n) {
                    System.out.print("*");
                } else
                    System.out.print("/");
            }
            for (int j = 0; j<=n; j++){
                if (j==0){
                    System.out.print("*");
                } else if (i<j-1) {
                    System.out.print(" ");
                } else
                    System.out.print("\\");
            }
            System.out.print("\n");
        }

    }
}


