plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "TrueFalse"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
