package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        validasi ("Maya Ratnasari")
        validasi ("Siti Kamilatun")
        validasi ("")
    }catch (error : Exception){
        println("${error.message}")
    }
}
    fun validasi (name : String) {
        if (name.isBlank()){
            throw Exception ("Nama tidak boleh kosong")
        }else
        {
            println("Hallo! $name")
        }
    }

