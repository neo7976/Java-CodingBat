package com.codingbat.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalTwo {

    /**
     * Учитывая список целых чисел, вернуть список целых чисел, опуская те, которые меньше 0.
     * noNeg([1, -2]) → [1]
     * noNeg([-3, -3, 3, 3]) → [3, 3]
     * noNeg([-1, -1, -1]) → []
     */
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }

    /**
     * Учитывая список неотрицательных целых чисел, вернуть список этих чисел, исключая те, которые заканчиваются на 9. (Примечание: % на 10)
     * no9([1, 2, 19]) → [1, 2]
     * no9([9, 19, 29, 3]) → [3]
     * no9([1, 2, 3]) → [1, 2, 3]
     */
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> !(n % 10 == 9)).collect(Collectors.toList());
    }

    /**
     * Учитывая список целых чисел, вернуть список этих чисел, опуская числа от 13 до 19 включительно.
     * noTeen([12, 13, 19, 20]) → [12, 20]
     * noTeen([1, 14, 1]) → [1, 1]
     * noTeen([15]) → []
     */
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, вернуть список строк, опуская любую строку, содержащую «z».
     * (Примечание: метод str.contains(x) возвращает логическое значение)
     * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
     * noZ(["hziz", "hzello", "hi"]) → ["hi"]
     * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */
    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(n -> !(n.contains("z"))).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, вернуть список строк, опуская любую строку длиной 4 или более.
     * noLong(["это", "не", "слишком", "длинный"]) → ["не", "слишком"]
     * noLong(["а", "bbb", "cccc"]) → ["а ", "bbb"]
     * noLong(["cccc", "cccc", "cccc"]) → []
     */
    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(n -> n.length() < 4).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, вернуть список строк, опуская любую длину строки 3 или 4.
     * no34(["a", "bb", "ccc"]) → ["a", "bb"]
     * no34(["a", "bb", "ccc", "dddd"]) → ["a ", "bb"]
     * no34(["ccc", "dddd", "apple"]) → ["apple"]
     */
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(n -> n.length() != 3 && n.length() != 4).collect(Collectors.toList());
    }

    /**
     * Учитывая список строк, верните список, в котором к каждой строке добавлено «y», опуская любые результирующие строки,
     * содержащие «yy» в качестве подстроки в любом месте.
     * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
     * noYY(["a", "b", "cy"]) → ["ay ", "by"]
     * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
     */
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(n -> n + "y").filter(n -> !n.contains("yy")).collect(Collectors.toList());
    }

    /**
     * Учитывая список неотрицательных целых чисел, вернуть список этих чисел, умноженных на 2, опуская все полученные числа, оканчивающиеся на 2.
     * two2([1, 2, 3]) → [4, 6]
     * two2([2, 6, 11]) → [4]
     * two2([0]) → [0
     */
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).filter(n -> !String.valueOf(n).endsWith("2")).collect(Collectors.toList());
    }

    /**
     * Учитывая список целых чисел, вернуть список этих чисел в квадрате и произведение,
     * добавленное к 10, опуская любые из полученных чисел, которые заканчиваются на 5 или 6.
     * square56([3, 1, 4]) → [19, 11]
     * square56([1]) → [11]
     * square56([2]) → [14]
     */
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(n -> n * n + 10)
                .filter(n -> !String.valueOf(n).endsWith("5") && !String.valueOf(n).endsWith("6"))
                .collect(Collectors.toList());
    }
}
