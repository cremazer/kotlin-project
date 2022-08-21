package game

val BASE_HEALTH_POINT_FOR_AURA = 50
val NAME = "마드리갈"
val IS_IMMORTAL = false

fun main() {
    var healthPoints = 89
    var isBlessed = true

    val auraColor = if (isAuraVisible(healthPoints, isBlessed)) "green" else "none"
    println("Aura is $auraColor.")

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    println("$NAME $healthStatus")

    castFireball()
}

fun castFireball(numFireballs: Int = 2) = println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음"
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유됨."
        } else {
            "경미한 상처만 있음"
        }
        in 15..74 -> "많이 다친 것 같음"
        else -> "최악의 상태임!"
    }

private fun isAuraVisible(healthPoints : Int, isBlessed: Boolean): Boolean {
    return isBlessed && healthPoints > BASE_HEALTH_POINT_FOR_AURA || IS_IMMORTAL
}
