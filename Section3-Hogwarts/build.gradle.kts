plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Hogwarts"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
