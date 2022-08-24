package game

fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2022
        println("$numBuildings 채의 건물이 추가됨.")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }

    println(greetingFunction("럭키", 2))
}