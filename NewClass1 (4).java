try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
} catch (IndexOutOfBoundsException e) {
    System.out.println("Catching exception: " + e);
}
/*
Изначально в блоке try переменная d инициализируется с нулевым 
значением, и попытка выполнить деление intArray[8] / d приводит 
к возникновению исключения ArithmeticException. В блоке 
catch для этого исключения мы перехватываем и обрабатываем 
ошибку, выводя сообщение об исключении.

Теперь блок catch включает две различные ветки - первая обрабатывает 
исключение ArithmeticException, которое может возникнуть при делении 
на 0, а вторая обрабатывает исключение IndexOutOfBoundsException, 
которое может возникнуть при обращении к элементу массива с 
недопустимым индексом.

В коде могут возникнуть и другие исключения, которые не были 
упомянуты ранее, например, NullPointerException, которое может 
возникнуть, если переменная intArray имеет значение null.

Чтобы обработать это исключение, можно добавить еще одну ветку 
в блок catch
*/