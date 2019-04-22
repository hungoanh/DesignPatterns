package creational.factory

class KnifeStore {
    private lateinit var factory: KnifeFactory
    fun KnifeStore(factory: KnifeFactory) {
        this.factory = factory
    }
}