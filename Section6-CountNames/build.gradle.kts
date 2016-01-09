plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CountNames"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
