public class task1 {

    public static void NullPointerExe(String word){
        word=null;
        if(word.equals("mohanad")){
            System.out.println("Same word");
        } else{
            System.out.println("Not the same word");
        }


    }
}

class Tester{
    public static void main(String[] args) {

        try{
            Task1.NullPointerExe("mohanad almasaabi");

        }catch (NullPointerException ex){
            System.out.println("NullPointer error was found!");
            System.out.println("\n"+ ex);
            ex.printStackTrace();
}
