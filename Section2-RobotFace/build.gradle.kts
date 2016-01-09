plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "RobotFace"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
