plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "IsGooglewhack"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
