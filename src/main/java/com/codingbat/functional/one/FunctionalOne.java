package com.codingbat.functional.one;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalOne {

    /**
     * Учитывая список целых чисел, вернуть список, в котором каждое целое число умножается на 2.
     * удвоение ([1, 2, 3]) → [2, 4, 6]
     * удвоение ([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
     * удвоение ([] ) → []
     */
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }

    /**
     * Учитывая список целых чисел, вернуть список, в котором каждое целое число умножается само на себя.
     * квадрат ([1, 2, 3]) → [1, 4, 9]
     * квадрат ([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
     * квадрат ([] ) → []
     */
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, верните список, в котором каждая строка имеет «*» в конце.
     * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
     * addStar(["привет", "здесь"]) → ["привет* ", "там*"]
     * addStar(["*"]) → ["**"]
     */
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(n -> n + "*").collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, верните список, в котором каждая строка заменена 3 копиями строки, объединенными вместе.
     * copy3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
     * copy3(["24", "a", ""]) → ["242424" , "ааа", ""]
     * копий3(["привет", "там"]) → ["приветприветпривет", "тамтамтам"]
     */
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(n -> n + n + n).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, верните список, в котором к каждой строке добавлено «y» в начале и в конце.
     * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
     * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
     * moreY(["yay"]) → ["yyayy"]
     */
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(n -> "y" + n + "y").collect(Collectors.toList());
    }

    /**
     * Учитывая список целых чисел, вернуть список, в котором каждое целое число добавляется к 1, а результат умножается на 10.
     * math1([1, 2, 3]) → [20, 30, 40]
     * math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
     * math1([10]) → [110]
     */
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
    }

    /**
     * Учитывая список неотрицательных целых чисел, вернуть список целых чисел из самых правых цифр. (Примечание: используйте %)
     * rightDigit([1, 22, 93]) → [1, 2, 3]
     * rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
     * rightDigit([10, 0 ]) → [0, 0]
     */
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, вернуть список, в котором каждая строка преобразуется в нижний регистр (Примечание: метод String toLowerCase()).
     * lower(["Hello", "Hi"]) → ["hello", "hi"]
     * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
     * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
     */
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, верните список, в котором у каждой строки удалены все ее «x».
     * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
     * noX(["xxax", "xbxbx", "xxcx"]) → ["a ", "bb", "c"]
     * noX(["x"]) → [""]
     */
    public List<String> noX(List<String> strings) {
        return strings.stream().map(n -> n.replace(String.valueOf('x'), "")).collect(Collectors.toList());
    }

}
