package laba1

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val labaService: LabaService
) {

    @GetMapping("/alax")
    fun getAlax() = labaService.getAlax()

    @GetMapping("/noAccess")
    @PreAuthorize("@labaAutorize.hasLabaAutorize(#token)")
    fun noAccess(@RequestParam(required = false) token: String?) = labaService.noAccess()
}
