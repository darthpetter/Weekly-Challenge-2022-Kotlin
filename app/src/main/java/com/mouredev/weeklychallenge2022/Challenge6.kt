package com.mouredev.weeklychallenge2022

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
fun main(){
    solucionV1()
    solucionV2()
}

/*
*Solucionado el 07/02/2022 por PetterJosé
 */
fun solucionV1(){
    val frase:String="Hola Mundo Mundial"
    var fraseDescompuesta=ArrayList<Char>()
    for(letra in frase){
        fraseDescompuesta.add(letra)
    }
    for(x in fraseDescompuesta.size downTo 1){
        print(fraseDescompuesta[x-1])
    }
}

fun solucionV2(){
    val frase:String="Hola Mundo Mundial"
    var index:Int=frase.length

    while(index>0){
        print(frase[index-1])
        index--
    }
}