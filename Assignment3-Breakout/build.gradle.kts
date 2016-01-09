plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Breakout"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
