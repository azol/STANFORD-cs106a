plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "BlankACM"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
