public class Main {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Learn Basic Java";
        model[1] = "Case Study Basiv Java: Todolist Application";
        showTodoList();
    }

    public static void addTodoList(String todo) {
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (var i = 0; i < 25; i++) {
            addTodoList("Example Todo - " + i);
        }

        showTodoList();
    }

    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("One");
        addTodoList("Two");
        addTodoList("Three");
        addTodoList("Four");
        addTodoList("Five");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("x. Exit");

            var input = input("Choose Number");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Choice doesn't exist");
            }
        }
    }

    public static void testViewShowTodList() {
        addTodoList("One");
        addTodoList("Two");
        addTodoList("Three");
        addTodoList("Four");
        addTodoList("Five");
        viewShowTodoList();
    }

    public static void viewAddTodoList() {
        System.out.println("ADD TODOLIST");

        var todo = input("Todo (x to cancel)");

        if (todo.equals("x")) {
            // Cancel
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodolist() {
        addTodoList("One");
        addTodoList("Two");
        viewAddTodoList();

        showTodoList();
    }

    public static void viewRemoveTodoList() {
        System.out.println("DELETE TODOLIST");

        var number = input("Number to remove (x to cancel)");

        if (number.equals("x")) {
            // Cancel
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Failed to remove todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodolist() {
        addTodoList("One");
        addTodoList("Two");
        addTodoList("Three");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}