plugins {
	eclipse
	idea
	application
}

application {
	mainClass = "CaesarCipher"
}

dependencies {
	implementation(files("libs/acm-2.0.jar"))
}
