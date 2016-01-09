plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "EtchASketch"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
