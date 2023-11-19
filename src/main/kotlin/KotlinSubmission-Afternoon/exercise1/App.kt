package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    println("latihan1")
    val nmdepan : String = "Maya"
    val nmbelakang : String = "Ratnasari"
    val usia : Int = 20
    val status : Boolean = true

    println("Nama   : $nmdepan $nmbelakang")
    println("Umur   : $usia")
    println("Status Saya : ${if(status) "Single" else "Tidak Single"}")
//    var Status_Single : Boolean = true
//    var Status_Tidak : Boolean = false
//    println("Status saya : " + (Status_Single > Status_Tidak))
//

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

        println(groupId)
        println(groupMember)
        println(session)
    return arrayOf(groupId, groupMember, session)
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val Omnidev = listOf("Maya", "Nanda", "Eva", "Faqih", "Ilham", "hasan", "John", "Mita", "Amanda", "Yoel", "Yuda")
    return Omnidev

}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Hasan", "Yogi")
    val countOfGroup = 11

    return (mentor.count() + countOfGroup)
}

fun main() {

    myProfile()

    val team = myTeam()
    println("My team is: $team")

//    val daftarAnggota = listOf("Maya", "Nanda", "Eva", "Ilham", "hasan", "John", "Mita", "Amanda", "Yoel", "Yuda")
//    val namagrup = "OmniDev"
//    val sesikelas = "Afternoon"
//
//    val detailGrup = groupDetail(namagrup, daftarAnggota, sesikelas)
//    println("Detail Grup: $detailGrup")

    val totalMember = totalMember()
    println("Total Member group dan Mentor : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Omnidev", listOf("Maya", "Nanda", "Eva", "Faqih", "Ilham", "hasan", "John", "Mita", "Amanda", "Yoel", "Yuda"), "Afternoon")

}