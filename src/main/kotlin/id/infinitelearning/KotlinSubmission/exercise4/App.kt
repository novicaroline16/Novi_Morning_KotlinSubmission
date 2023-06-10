package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    fun main() {
        try {
            // Potensi kode yang dapat menimbulkan exception
            val angka1 = 10
            val angka2 = 0
            val hasil = angka1 / angka2
            println("Hasil: $hasil")
        } catch (e: ArithmeticException) {
            // Penanganan exception khusus untuk ArithmeticException
            println("Terjadi kesalahan aritmatika: ${e.message}")
        } catch (e: Exception) {
            // Penanganan exception umum untuk semua jenis exception lainnya
            println("Terjadi kesalahan: ${e.message}")
        }
    }

}