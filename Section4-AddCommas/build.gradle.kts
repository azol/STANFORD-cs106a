plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "AddCommas"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
