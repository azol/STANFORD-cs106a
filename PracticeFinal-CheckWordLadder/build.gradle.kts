plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CheckWordLadder"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
