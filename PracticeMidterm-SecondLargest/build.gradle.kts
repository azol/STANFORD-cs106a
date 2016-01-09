plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "SecondLargest"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
