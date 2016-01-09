plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "FlipVertical"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
