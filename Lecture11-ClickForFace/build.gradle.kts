plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "ClickForFace"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
