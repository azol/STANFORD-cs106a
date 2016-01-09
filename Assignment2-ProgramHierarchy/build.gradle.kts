plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "ProgramHierarchy"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
