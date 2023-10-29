package part5.Task15;

    public class Task15<T> {
        //15. Створити загальний (generic) клас, який представлятиме простий контейнер. Контейнер повинен дозволяти вам додавати елемент і отримувати його.
        private T item;

        public void add(T item) {
            this.item = item;
        }

        public T get() {
            return item;
        }

        public static void main(String[] args) {

            Task15<String> stringContainer = new Task15 <>();
            stringContainer.add("Hello, World");
            String str = stringContainer.get();
            System.out.println("String Container: " + str);

            Task15<Integer> intContainer = new Task15<>();
            intContainer.add(42);
            int num = intContainer.get();
            System.out.println("Integer Container: " + num);
        }
    }
