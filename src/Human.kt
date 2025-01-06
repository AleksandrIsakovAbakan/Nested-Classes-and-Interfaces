class Human(val name: String) {

    inner class Head {
        fun informationHead(time: Int) {
            println("Человек $name может думать $time мин.")
        }
    }

    inner class Legs {
        fun informationLegs(time: Int) {
            println("Человек $name может ходить $time ч.")
        }
    }

    inner class Hands {
        fun informationHands(time: Int) {
            println("Человек $name может руками махать $time ч.")
        }
    }

    override fun toString(): String {
        return "Human(name='$name')"
    }

}