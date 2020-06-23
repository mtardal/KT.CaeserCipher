val alphabet = charArrayOf('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z', 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')

fun caesarCipher(text: String, key: Int): String {
    val plainText = text.toCharArray()
    println("Before: $text")

    val newText = mutableListOf<Char>()

    for (char in plainText) {
        val index = alphabet.indexOf(char)
        var offset = index + key

        if (index < 26 && offset >= 26) offset -= 26
        else if (offset >= 52) offset -= 26

        if (!alphabet.contains(char)) newText.add(char)
        else newText.add(alphabet[offset])
    }
return newText.joinToString(separator = "")
}

fun main() {
   println("After: ${caesarCipher("What a string!", 5)}")
}
