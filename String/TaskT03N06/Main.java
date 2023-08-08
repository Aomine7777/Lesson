package String.TaskT03N06;

public class Main {
    public static void main(String[] args) {
        //TaskT03N06
        //Часто бывает, что данные нужно считать из CSV-файла. CSV — текстовый формат, предназначенный для представления табличных данных.
        // Строка таблицы соответствует строке текста, которая содержит одно или несколько полей, разделенных запятыми(или точкой с запятой).
        // Например, можно представить первую попавшуюся вакансию в таком формате:
        //java-developer;200000 р.;от 6 лет;Kafka, PostgreSQL, Cassandra, Memcached и RabbitMQ.
        String txt = "java-developer;200000 р.;от 6 лет;Kafka, PostgreSQL, Cassandra, Memcached и RabbitMQ";
        String[] values = txt.split(";");
        System.out.println(values[values.length - 1]);
    }
}
