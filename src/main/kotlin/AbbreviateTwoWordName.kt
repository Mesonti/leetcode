class AbbreviateTwoWordName {

    fun abbrevName(name: String): String {
        var v = name.indexOf(' ')
        return "${name[0].uppercase()}.${name[v + 1].uppercase()}"

    }

}