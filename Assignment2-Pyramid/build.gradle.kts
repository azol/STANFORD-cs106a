plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Pyramid"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
