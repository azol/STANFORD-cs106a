plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "StringQueueDemo"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
