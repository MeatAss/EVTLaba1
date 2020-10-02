package laba1

import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
class LabaConfig: WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        super.configure(http)
    }

    override fun configure(web: WebSecurity) {
        // do not apply security restrictions to following endpoints
        web.ignoring()
            .antMatchers(HttpMethod.GET, "/alax")
            .antMatchers(HttpMethod.OPTIONS, "/**")
    }
}
