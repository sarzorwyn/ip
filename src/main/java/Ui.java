import Task.Task;

import java.util.ArrayList;

public class Ui {

    // TODO: Make a method to print line
    public static final String LINE_STRING = "____________________________________________________________\n";

    public void addToListMessage(int size, String status) {
        System.out.print(LINE_STRING);
        System.out.println("Say no more fam. The task is added:\n  " + status);
        System.out.println(size + " tasks in the list.");
        printLine();
    }

    private void printLine() {
        System.out.println(LINE_STRING);
    }

    public void printList(TaskList tasks) {
        System.out.print(Ui.LINE_STRING);
        for (int i = 0; i < tasks.getSize(); i++) {
            System.out.println((i+1) + "." + tasks.getStatus(i));
        }
        System.out.println(Ui.LINE_STRING);
    }

    public void completeTaskMessage(String status) {
        System.out.print(LINE_STRING);
        System.out.println("Task.Task marked as done, gg ez");
        System.out.println("  " + status);
        System.out.println(LINE_STRING);
    }

    public void deleteTaskMessage(String status, int size) throws IndexOutOfBoundsException {
        System.out.print(LINE_STRING);
        System.out.println("You are a quitter 👎 Anyways, I removed this:");
        System.out.println("  " + status);
        System.out.println(size + " tasks left in the list.");
        System.out.println(LINE_STRING);
    }

    public void printDeleteTask(TaskList results, String query) {
        System.out.print(LINE_STRING);
        System.out.println("Here are the tasks in your list that match「" + query + "」:");
        for (int i = 0; i < results.getSize(); i++) {
            System.out.println((i+1) + "." + results.getStatus(i));
        }
        System.out.print(LINE_STRING);
    }

    public void welcomeMessage() {
        String welcome = LINE_STRING +
                " Hello! I'm Bob 😀\n" +
                " If you need anything hit me up fam 😌\n" +
                LINE_STRING;
        System.out.print(welcome);
    }

    public void goodbyeMessage() {
        String goodbye = LINE_STRING + " Chao 👌\n" + LINE_STRING;
        System.out.print(goodbye);
    }

    public void printNoCommandFormat(Command commandType) {
        String commandName = commandType.name().toLowerCase();
        String exceptionMessage = LINE_STRING +
                " 😥 You gotta use the time marker for " + commandName + "\n" +
                "and the time which it happens\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printNoCommandLabel(Command commandType) {
        String commandName = commandType.name().toLowerCase();
        String exceptionMessage = LINE_STRING +
                " 😥 You gotta tell me what is the task for " + commandName + "\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printNoSuchMethod() {
        String exceptionMessage = LINE_STRING +
                " 😥 I don't quite get what the command means\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printInputMismatch() {
        String exceptionMessage = LINE_STRING +
                " 😥 There is some issue with getting you input\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printIOException() {
        String exceptionMessage = LINE_STRING +
                " 😥 IO issue encountered! Unable to read file\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printNumberFormatException() {
        String exceptionMessage = LINE_STRING +
                " 😥 Number format exception encountered! Input may be corrupted\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printNoTaskSpecified() {
        String exceptionMessage = LINE_STRING +
                " 😥 Tell me what task are you referring to\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printIndexOutOfBounds() {
        String exceptionMessage = LINE_STRING +
                " 😥 Index out of bounds\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }

    public void printNoSearchQuery() {
        String exceptionMessage = LINE_STRING +
                " 😥 Please tell me what you are finding for\n" +
                LINE_STRING;
        System.out.println(exceptionMessage);
    }
}