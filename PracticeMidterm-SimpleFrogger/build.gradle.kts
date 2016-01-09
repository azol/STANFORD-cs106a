plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "SimpleFrogger"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
