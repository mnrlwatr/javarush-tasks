
package JavaRush.MiniProjects.chatting.Util;



public class ConsoleHelper {

    private ConsoleHelper() {
        throw new RuntimeException("Это утилитарный класс");
    }

    public static void writeMessage(String message){
        System.out.println(message);
    }

}
