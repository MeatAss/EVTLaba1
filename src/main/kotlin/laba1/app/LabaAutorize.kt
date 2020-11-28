package laba1.app

import org.springframework.stereotype.Component

@Component
class LabaAutorize {

    fun hasLabaAutorize(token: String?) = token == "please"
}
