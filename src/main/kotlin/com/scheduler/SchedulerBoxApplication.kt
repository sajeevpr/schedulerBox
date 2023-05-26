package com.scheduler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchedulerBoxApplication

fun main(args: Array<String>) {
	runApplication<SchedulerBoxApplication>(*args)
}
