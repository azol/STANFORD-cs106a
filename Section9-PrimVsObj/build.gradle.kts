plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "PrimVsObj"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
