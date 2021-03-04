package br.com.umgdoism.adapter.`in`.web

import br.com.umgdoism.adapter.`in`.web.resources.NovoAutorResourceRequest
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/autores")
class CadastraAutorController {

    @Post
    fun cadastra(@Body @Valid request: NovoAutorResourceRequest){
        println(request)
    }
}