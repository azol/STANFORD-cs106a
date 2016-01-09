plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "StringExamples"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
