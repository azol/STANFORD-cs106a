plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Checkerboard"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
