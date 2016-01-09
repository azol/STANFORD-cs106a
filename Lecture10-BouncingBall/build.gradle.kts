plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "BouncingBall"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
