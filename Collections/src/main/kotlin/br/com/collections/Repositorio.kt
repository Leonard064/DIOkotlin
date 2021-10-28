package br.com.collections

//cria um banco de dados simulado
class Repositorio<T> {
    private val map = mutableMapOf<String, T>() // cria um mapa mutável

    //função de inserção
    fun create(id: String,value: T){
        map[id] = value
    }

    //função de remoção
    fun remove(id: String) = map.remove(id)

    //função de pesquisa
    fun findById(id: String) = map[id]

    //pega todos os itens do mapa
    fun findAll() = map.values
}