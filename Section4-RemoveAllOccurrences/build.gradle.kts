plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "RemoveAllOccurrences"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}

