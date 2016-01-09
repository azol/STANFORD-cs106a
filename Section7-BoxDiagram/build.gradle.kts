plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "BoxDiagram"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
