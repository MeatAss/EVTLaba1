package laba1

import org.springframework.stereotype.Component

@Component
class LabaAutorize {

    fun hasLabaAutorize(token: String?) = token == "please"
}
