package creational.factory

class KnifeFactory {
    fun createKnife(knifeType: String): Knife {
        return when (knifeType) {
            "steak" -> SteakKnife()
            else -> ChefKnife()
        }
    }
}

class SteakKnife: Knife

class ChefKnife: Knife