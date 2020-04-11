class Controller(private val persegi: Persegi, private val iCallback: ICallback){
    fun calculateArea(){
        val area = persegi.getSisi() * persegi.getSisi()
        iCallback.showResult(area)//Memanggil fungsi dari interface
    }
}