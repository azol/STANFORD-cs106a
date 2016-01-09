plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "TextFieldExample"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
