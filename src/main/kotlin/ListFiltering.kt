class ListFiltering {

    fun filterList(list: List<Any>): List<Int> = list.filterIsInstance<Int>()

    fun filterList1(list: List<Any>): List<Int> {
        var newList = mutableListOf<Int>()
        for (element in list) {
            if (element is Int) newList.add(element)
        }
        return newList
    }
}
