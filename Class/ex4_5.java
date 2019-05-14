package Class;

/**
 * Заданы два массива строк. Написать функцию, определяющую, является ли содержимое этих массивов идентичным.
 * Порядок расположения элементов значения не имеет.
 */
public class ex4_5 {
    public static void main(String[] args) {
        System.out.println(arrEquals(("A D C".split(" "),"D C A B".split(" "))));
    }
    private static boolean arrEquals(String[] left, String [] right){
        boolean flag = true;
        for (String l:left){
           boolean found = false;{
               if (l.equals() (r)){
                   found= true;
                }
            }
            for(String r:right){

            }
        }
        return flag;

      /*  "hello".equals("other");
        "hello".equalsIgnoreCase("Hello");//true
        int diff    = "c".compareTo          ("A"); //34
        int diffI   = "c".compareToIgnoreCase("A"); //2
        int idx     = "abcbc".indexOf("bc");        //1
        int lastIdx = "abcbc".lastIndexOf("bc");    //3
     */
    }
}
