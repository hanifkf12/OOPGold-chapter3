class Main {

    companion object : ICallback{
        @JvmStatic
        fun main(args : Array<String>){
            var input : String
            do {
                println("Program hitung bangun datar")
                println("===========================")
                println("Menu : ")
                println("1. Hitung persegi")
                println("2. Exit")
                print("Masukan Pilihan Anda : ")
                input = readLine().toString()
                when(input){
                    "1" -> {
                        menuPersegi()
                    }
                    "2" ->{
                        println("Good Bye")
                    }
                    else->{
                        println("Input Salah")
                    }
                }
            }while(input!="2")
            val pilihan = listOf("batu","gunting","kertas")
            val pilihanComputer = pilihan.random().toUpperCase()
        }
        fun menuPersegi(){
            print("Masukan panjang sisi : ")
            val sisi = readLine()!!.toInt()
            val persegi = Persegi(sisi)
            val controller = Controller(persegi, this)
            controller.calculateArea()
        }

        override fun showResult(result: Int) {
            println("Luas : $result")
        }




    }
}