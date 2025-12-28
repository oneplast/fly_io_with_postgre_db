package io.river.flyiopostgres

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlyIoPostgresApplication

fun main(args: Array<String>) {
    runApplication<FlyIoPostgresApplication>(*args)
}
