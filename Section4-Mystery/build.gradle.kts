plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "Mystery"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
