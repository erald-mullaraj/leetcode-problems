package Easy

fun main () {
    var p = ExcelSheetColumnTitle().convertToTitle(28)
    println(p)
}

class ExcelSheetColumnTitle {
    fun convertToTitle(columnNumber: Int): String{
        var r = ""
        var c = columnNumber
        while(c > 0){
            c--
            r = (c%26 + 65).toChar() + r
            c /= 26
        }
        return r;
    }
}

