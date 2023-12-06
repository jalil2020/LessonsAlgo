package letcode


fun main() {
    print(largestGoodInteger("2300019"))
}

fun largestGoodInteger(num: String): String {
    var ans = ""
    for (i in num.indices) {
        if (i < num.length - 2 && num[i] == num[i + 1] && num[i] == num[i + 2] && (ans.isEmpty() || ans[0] < num[i])) {
            ans = "${num[i]}"
            ans += ans + ans
        }
    }
    return ans
}
