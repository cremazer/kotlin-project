package game

val BASE_HEALTH_POINT_FOR_AURA = 50
val NAME = "마드리갈"
val IS_BLESSED = true
val IS_IMMORTAL = false

fun main() {
    var healthPoints = 89

    val auraColor = if (isAuraVisible(healthPoints)) "green" else "none"
    println("Aura is $auraColor.")

    val healthStatus = if (healthPoints == 100) {
        "최상의 상태임!"
    } else if (healthPoints >= 90) {
        "약간의 찰과상만 있음"
    } else if (healthPoints >= 75) {
        if (IS_BLESSED) {
            "경미한 상처가 있지만 빨리 치유됨."
        } else {
            "경미한 상처만 있음"
        }
    } else if (healthPoints >= 15) {
        "많이 다친 것 같음"
    } else {
        "최악의 상태임!"
    }

    println("$NAME $healthStatus")
}

fun isAuraVisible(healthPoints : Int): Boolean {
    return IS_BLESSED && healthPoints > BASE_HEALTH_POINT_FOR_AURA || IS_IMMORTAL
}
