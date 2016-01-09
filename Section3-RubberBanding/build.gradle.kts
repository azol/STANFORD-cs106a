plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "RubberBanding"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
