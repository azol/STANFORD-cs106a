plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "UfoGame"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
