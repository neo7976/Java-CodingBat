# Функциональный API Java

`list.replaceAll(lambda)`-- вызывает лямбду один раз для каждого элемента в списке, сохраняя результат обратно в
список (или другой тип коллекции). напримерnums.replaceAll(n -> n * 2);

`list.removeIf(lambda)`-- вызывает лямбда-выражение один раз для каждого элемента в коллекции, удаляя каждый элемент, в
котором лямбда-выражение возвращает значение true. напримерnums.removeIf(n -> n < 0);

Простые лямбда-примеры -- типы данных выводятся из контекста и из типа выражения, следующего за "->":
`n -> n * 2`-- принимает целое число, возвращает целое число
`n -> n < 0 && n >= -10`-- принимает целое число, возвращает логическое значение
`s -> s.length()`  -- принимает строку, возвращает целое число
`s -> s.startsWith("hi")`-- принимает строку, возвращает логическое значение

Потоковая система Java предоставляет более сложные лямбда-функции. Потоковые вызовы не изменяют исходный список,
возвращая новую структуру данных результатов. Обратите внимание, что логическая логика filter() противоположна
removeIf().

```
List<Integer> nums = -something-;
nums = nums.stream()
.map(n -> n * 2)
.filter(n -> n >= 0)
.collect(Collectors.toList());
```

Выше приведены только самые распространенные вызовы, для получения дополнительной информации см. официальную
документацию по [Java Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html).

# Удалить определенные символы из строки в Java

В этом посте будет обсуждаться, как удалить определенные символы из строки в Java.

### 1. Использование String.replaceAll() метод

Стандартное решение для замены каждой подстроки строки, которая соответствует заданному регулярному выражению,
использует метод `String.replaceAll()` метод.

Его можно использовать для удаления определенных символов из строки, как показано ниже. Следующий код заменяет все
совпадения регулярного выражения `\w` с пустой строкой `""`. Обратите внимание, что `\w` это предопределенный класс
символов, который обозначает словесный символ `[a-zA-Z_0-9]`.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World_123!!";

        str = str.replaceAll("[^\\w+]", "");
        System.out.println(str);
    }
}
```

**Результат:** HelloWorld_123

Если вам нужно сохранить только несколько символов, вы можете указать эти символы после отрицания ^. Например, [^a-zA-Z]
соответствует любому символу, кроме a к z, а также A к Z.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World_123!!";

        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
    }
}
```

**Результат:**
HelloWorld

### 2. Использование String.replace() метод

Вот еще одно решение, которое использует `String.replace()` метод для удаления всех вхождений каждого символа из строки
в цикле. Этот метод может работать относительно медленнее, чем `replaceAll()` метод.

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World_123!!";
        String charsToRemove = ",_!";

        for (char c : charsToRemove.toCharArray()) {
            str = str.replace(String.valueOf(c), "");
        }

        System.out.println(str);
    }
}
```

**Результат:**
Hello World123

### 3. Использование Guava

Если вы предпочитаете библиотеку `Guava`, вы можете использовать ее `CharMatcher` класс для удаления определенных
символов из строки. Идея состоит в том, чтобы получить сопоставитель символов, который соответствует любому из указанных
символов, и удалить все соответствующие символы из указанного набора символов с помощью команды `removeFrom()` метод.
Это показано ниже:

```java
import com.google.common.base.CharMatcher;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, World_123!!";
        String charsToRemove = ",_!";

        str = CharMatcher.anyOf(charsToRemove).removeFrom(str);
        System.out.println(str);
    }
}
```

**Результат:**
Hello World123

В качестве альтернативы вы можете использовать `retainFrom()` метод для сохранения всех совпадающих символов из
указанного набора символов, как показано ниже:

```java
import com.google.common.base.CharMatcher;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, World_123!!";
        String charsToRetain = "0123456789";

        str = CharMatcher.anyOf(charsToRetain).retainFrom(str);
        System.out.println(str);
    }
}
```
