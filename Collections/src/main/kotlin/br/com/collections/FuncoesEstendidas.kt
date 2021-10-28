package br.com.collections

import java.math.BigDecimal

//Duas funções estendidas

//função de somatório
fun Array<BigDecimal>.somatorio() = this.reduce{
    acc, valor -> acc + valor
}

//função de médias
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatorio() / this.size.toBigDecimal()