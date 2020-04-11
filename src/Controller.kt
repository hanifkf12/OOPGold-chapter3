class Controller(private val persegi: Persegi, private val iCallbakc: ICallbakc){
    fun calculateArea(){
        val area = persegi.sisi * persegi.sisi
        iCallbakc.showResult(area)
    }
}