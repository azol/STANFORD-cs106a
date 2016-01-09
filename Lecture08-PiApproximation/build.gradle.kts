plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "PiApproximation"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
