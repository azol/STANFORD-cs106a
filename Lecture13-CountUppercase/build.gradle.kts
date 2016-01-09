plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CountUppercase"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
