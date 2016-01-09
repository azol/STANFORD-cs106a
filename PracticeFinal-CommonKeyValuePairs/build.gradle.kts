plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CommonKeyValuePairs"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
