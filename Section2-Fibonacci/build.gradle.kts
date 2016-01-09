plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Fibonacci"
}

dependencies {
		implementation(files("libs/acm-2.0.jar"))
}
