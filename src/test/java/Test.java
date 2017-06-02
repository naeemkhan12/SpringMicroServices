import com.sun.xml.internal.txw2.output.CharacterEscapeHandler;

/**
 * Created by naeem on 6/1/17.
 */
public class Test {

    public char shift(char character,int toShift){

        return (char)((int) character+toShift % 26);
    }
    public static void main(String[] args){

        char[] cypherText = {'Z','K','K','F','F','B','W','Z','M','V','P','V','R','I','J','L'
        ,'E','K','Z','C','K','Y','Z','J','S','F','F','B','W','Z','E','R','C','C','P','T','F','L',
        'C','U','S','V','K','I','R','E','J','C','R','K','V','U'};
        Test test = new Test();
        for(int i=1; i< 26 ; i++){
            for(char index: cypherText){
                System.out.print(test.shift(index,i));

            }
            System.out.println();
        }


    }
}
