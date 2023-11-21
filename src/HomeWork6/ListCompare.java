package HomeWork6;

import java.util.List;

class ListCompare {
    /**
     * Проверяет пустой ли список.
     * Вычисляет средне арифметическое значение списка
     *
     * @param lst список
     * @return - Возвращает арифметическое значение списка
     **/
    public static Double getListAverage(final List<Number> lst) {
        if (lst.isEmpty()) {
            try {
                throw new Exception("Список пуст");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        double sum = 0;
        for (Number number : lst) {
            sum += number.doubleValue();
        }
        return sum / lst.size();
    }

    /**
     * Сравнивает средние арифметические значения числовых списков.
     *
     * @param lst1 первый список
     * @param lst2 второй список
     **/
    public static void compareListsAverages(final List<Number> lst1,
                                            final List<Number> lst2) {
        double avr1 = getListAverage(lst1);
        double avr2 = getListAverage(lst2);

        if (avr1 > avr2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (avr1 < avr2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}
