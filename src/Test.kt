fun main() {
    var array = arrayOf("X++","++X","--X","X--")
    var X = 0

    for(i in 0 until array.size) {
        when(array[i]){
            "--X","X--" -> X = X - 1
            "X++","++X" -> X = X + 1
        }
    }

    println(X)

}