public class Demo{

   public static void main(String[] args) {

      String msg="努力成就伟大梦想！";

      for(int i=0;i<msg.length();i++) {

         if(i%2==0)

            continue;

         System.out.print(msg.charAt(i));

      }

      System.out.println("\n"+msg.substring(6,8));

   }

}