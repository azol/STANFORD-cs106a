plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "InteractiveDrawFace"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
