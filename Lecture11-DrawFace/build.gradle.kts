plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "DrawFace"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
