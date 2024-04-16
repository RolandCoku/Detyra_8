//Shkruaj nje metode te pergjithshme isEqualTo qe krahason dy argumenta me metoden equals
//dhe kthen true nese jane te njejta dhe false ne te kundert. Thirre kete metode me tipe te
//ndryshme te dhenash si Object, Integer etj.
public class Main {
    public static void main(String[] args) {
        System.out.println(isEqualTo(4,6));
        System.out.println(isEqualTo(null,"sjna"));
        System.out.println(isEqualTo(null,null));
        System.out.println(isEqualTo("aaaa","aaaa"));

    }

    public static <T> boolean isEqualTo(T obj1, T obj2){
        if(obj1 == null && obj2 == null){
            return true;
        }else if(obj1 == null || obj2 == null){
            return false;
        }else
            return obj1.equals(obj2);
    }
}