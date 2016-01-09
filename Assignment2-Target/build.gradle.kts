plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Target"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
