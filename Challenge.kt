import java.awt.SystemColor.menu
import java.util.*
public var input = Scanner(System.`in`);
fun main () {

    println("=======================================")
    print("Nama :")
    val nama: String? = input.nextLine()
    if (nama.isNullOrEmpty()) {
        println("Mohon untuk diisi")
        main()
    }
    print("Kelas :")
    val kelas: String? = input.nextLine()
    print("No absen: ")
    val absen = input.nextInt()
    print("GitHub :")
    val git: String? = null
    val gitLenght = git?.length?: "sharon-laura"
    println(gitLenght)
    println("=======================================")
    menu()
}
fun menu() {
    println("1.Balok\n2.Bola\n ")
    print("Pilih Menu Diatas : ")
    val pill:Int?  = input.nextInt()
    when (pill) {
        1 -> Balok()
        2 -> bola()
        else -> {
            println("Pilihan tidak tersedia")
            menu()
        }
    }
}
fun Balok() {
    println("=======================================")
    print("Masukan Panjang Balok : ")
    val Panjang: Double = input.nextDouble();
    print("Masukan Lebar Balok : ");
    val Lebar: Double = input.nextDouble();
    print("Masukan Tinggi Balok : ")
    val Tinggi: Double = input.nextDouble();
    val v: Double = Panjang * Lebar * Tinggi;
    println("=======================================");
    print("Volume dari Balok adalah ");
    System.out.printf("%.2f", v);
    println()
    println("========================================");
    menu()

}
fun bola() {
    println("==========================================");
    print("Masukan jari - jari Bola");
    var jari:Double? = null
    jari = input.nextDouble();
    val v = 4 / 3 * Math.PI * jari * jari * jari;
    println("==========================================")
    print("Volume dari Bola adalah ");
    System.out.printf("%.2f", v);
    println()
}