enum class LootType {
    POSITION, RING, ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {
    override fun toString(): String {
        return "$name is $type and is worth $value "
    }
}
