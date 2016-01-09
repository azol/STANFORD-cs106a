plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "RandomCircles"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
