plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "HeapStackDiagrams"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
