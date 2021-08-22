package Diversos

fun main(){

    var salario = 3300.0

    if( salario >= 1900.0 && salario <=2800.0){
        val IR = 7.5
        val deducaoSalario = salario * (IR / 100)
        print("A sua alíquota é de: ${IR}%\n")
        print("Você pode deduzir até: ${deducaoSalario}\n")

    }else if(salario >2800.0 && salario <=3751.0){
        val IR = 15
        val deducaoSalario = salario * (IR.toDouble() / 100)
        print("A sua alíquota é de: ${IR}%\n")
        print("Você pode deduzir até: ${deducaoSalario}\n")
    }else{
        val IR = 22.5
        val deducaoSalario = salario * (IR / 100)
        print("A sua alíquota é de: ${IR}%\n")
        print("Você pode deduzir até: ${deducaoSalario}\n")
    }
}