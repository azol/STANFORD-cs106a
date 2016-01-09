plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "UniqueNames"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
