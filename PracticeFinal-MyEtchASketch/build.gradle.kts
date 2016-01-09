plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "MyEtchASketch"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
