plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "FlyTunesStore"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
