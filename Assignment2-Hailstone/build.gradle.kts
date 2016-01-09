plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Hailstone"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
