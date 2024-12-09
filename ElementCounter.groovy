class ElementCounter {
    static Map countElements(List list) {
        list.countBy { it }
    }

    static void main(String[] args) {
        def numbers = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(numbers)
        println(result)
    }
}
