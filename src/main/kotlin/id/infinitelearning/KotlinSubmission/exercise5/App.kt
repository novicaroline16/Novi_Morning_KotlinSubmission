package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero: Hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    class Hero {

        private var name: String? = null
        private var age = 20
        private var height = 168

        private var health = 5

        fun setProfile(name: String?, age: Int, height: Int) {
            this.name = name
            this.age = age
            this.height = height
        }

        fun profile() {
            println("========= Profile =========")
            println("Name: $name")
            println("Age: $age")
            println("Height: $height")
            println("Health: $health")
            println("===========================")
        }

        private fun checkHealth() {
            if (health <= 0) {
                println("Anda telah mati $name")
            }
        }

        fun jalan() {
            checkHealth()
            println("$name sedang berjalan...")
            health -= 1
        }



        /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

        data class Profile(val group: Int, val jalan: Int, val lari: Int, val makan: Int, val minum: Int, val lompat: Int, val duduk: Int)
        fun main() {
            val profiles = listOf(
                Profile(1, 5, 2, 3, 1, 3, 1),
                Profile(2, 2, 2, 1, 3, 1, 2),
                Profile(3, 3, 1, 5, 1, 5, 3),
                Profile(4, 5, 4, 4, 4, 3, 2),
                Profile(5, 4, 1, 3, 5, 5, 3),
                Profile(6, 2, 4, 2, 2, 7, 4)
            )

            for (profile in profiles) {
                println("Group ${profile.group}:")
                println("Jalan ${profile.jalan}x, Lari ${profile.lari}x, Makan ${profile.makan}x, Minum ${profile.minum}x, Lompat ${profile.lompat}x, Duduk ${profile.duduk}x")
                println()
            }
        }

    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    fun checkHealth(jalan: Int, makan: Int, minum: Int, lompat: Int, duduk: Int, lari: Int) {
        val energy = jalan + makan + minum + lompat + duduk + lari
        health = energy
    }

    }



/**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

fun profile(activity: String, count: Int) {
    println("$activity: $count kali")
}

    fun main() {
        println("Group 1:")
        profile("Jalan", 5)
        profile("Lari", 2)
        profile("Makan", 3)
        profile("Minum", 1)
        profile("Lompat", 3)
        profile("Duduk", 1)

        println("Group 2:")
        profile("Jalan", 2)
        profile("Lari", 2)
        profile("Makan", 1)
        profile("Minum", 3)
        profile("Lompat", 1)
        profile("Duduk", 2)

        println("Group 3:")
        profile("Jalan", 3)
        // "Lari Ix" mungkin terjadi kesalahan penulisan, diganti menjadi "Lari 1x"
        profile("Lari", 1)
        profile("Makan", 5)
        profile("Minum", 1)
        profile("Lompat", 5)
        profile("Duduk", 3)

        println("Group 4:")
        profile("Jalan", 5)
        profile("Lari", 4)
        profile("Makan", 4)
        profile("Minum", 4)
        profile("Lompat", 3)
        profile("Duduk", 2)

        println("Group 5:")
        profile("Jalan", 4)
        profile("Lari", 1)
        profile("Makan", 3)
        profile("Minum", 5)
        profile("Lompat", 5)
        profile("Duduk", 3)

        println("Group 6:")
        profile("Jalan", 2)
        profile("Lari", 4)
        profile("Makan", 2)
        profile("Minum", 2)
        profile("Lompat", 7)
        profile("Duduk", 4)

    }


