plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "RemoveDoubledLetters"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
