package id.infinitelearning.KotlinSubmission.exercise1

import java.lang.System.console




/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() dipanggil
 */
fun myProfile() {
    val namadepan = "Novi"
    val namabelakang = "Caroline"
    val Umur = 20
    val tahun = "tahun"
    val sekolah = "Universitas Udayana"
    println("Perkenalkan nama saya $namadepan Nama belakang saya $namabelakang, Umur saya $Umur $tahun, Sedang berkuliah di $sekolah ")

    var Status_Single : Boolean = true
    var Status_Tidak : Boolean = false
    println("Status saya : " + (Status_Single > Status_Tidak))
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println(groupId)
    println(groupMember)
    println(session)

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val groupMember:String = "Bagas, Andis, Gilang, Ali, Tetuko, Mira, Nabilla, Novianta, Lisa, Anabil, Glency, Tirani"
    println("Daftar anggota grup saya yaitu = $groupMember")
    return "SAVORA"

}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

    fun totalMember(): Int {
        val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
        val countOfGroup = 12

        return (mentor.count() + countOfGroup)

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(1, listOf("Anggota 1", "Anggota 2", "..."), "Morning")
    groupDetail(12, listOf("Tetuko", "Andis", "Gilang", "Ali", "Bagas", "Mira", "Nabilla", "Novi", "Lisa", "Anabil", "Glency", "Tirani"), "Morning")
}