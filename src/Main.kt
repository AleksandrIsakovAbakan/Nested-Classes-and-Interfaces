fun main() {

    /*
    Создать класс Human(человек).
    В нем создать несколько внутренних классов, например, head(голова), legs(ноги),
    в каждом из классов напишите функции этой части тела.
    В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
    */
    val human = Human("Ivan")
    println(human)
    human.Head().informationHead(2)
    human.Legs().informationLegs(1)
    human.Hands().informationHands(3)
    println()

    val strings = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println(strings.contentDeepToString())
    searchAndDisplayArrayElementsBasedOnInputCharacters(strings)
    println()

    val array = intArrayOf(110, 6, 55, 0, 4, 3, 10, 140, 354, 56, 7, 0, 90)
    println(array.contentToString())
    println("Количество элементов, которые находятся между нолями: ${numberOfElementsThatAreBetweenZeros(array)}")
}

/*
Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов".
Написать программу поиска и вывода на экран элементов массива по вводимым символам.
*/
fun searchAndDisplayArrayElementsBasedOnInputCharacters(strings: Array<String>) {
    print("Введите символы для поиска: ")
    val temp = readln()
    if (temp.isEmpty()) return
    for (a in strings) if (a.indexOf(temp) > -1) println(a)
}

/*
Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд.
Посчитать количество элементов, которые находятся между нолями.
*/
fun numberOfElementsThatAreBetweenZeros(array: IntArray): Int {
    var flag = false
    var count = 0
    for (a in array) {
        if (a == 0) if (!flag) {
            flag = true
            continue
        } else break
        if (flag) count++
    }
    return count
}