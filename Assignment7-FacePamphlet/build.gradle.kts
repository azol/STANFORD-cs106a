plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "FacePamphlet"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
