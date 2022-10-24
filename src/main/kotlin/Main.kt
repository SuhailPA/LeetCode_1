import java.lang.StringBuilder

fun main(args: Array<String>) {
val str = arrayOf("aaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaa","aaaa","aaaaaaaaaaaaaaaaaaaaaaaa","aab","aaaaaaaaaaaaaaaaaaaaaa","aaaaaa",
"aaaaaaaaaaaaaaaaaaaaaaa","aaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaa")
println(longestCommonPrefix(str))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var index = 0
    var commonPrefix = ""
    var previousPrefix = ""
    if (strs.size == 1)return strs[0]
    while (index<strs.size-1){
        commonPrefix = strs[index].commonPrefixWith(strs[index+1])
        when{
            commonPrefix.isEmpty() -> return ""
            index == 0 -> previousPrefix = commonPrefix
            commonPrefix.length < previousPrefix.length -> previousPrefix = previousPrefix.commonPrefixWith(commonPrefix)
        }
        index++
    }
    return previousPrefix
}