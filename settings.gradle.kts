pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "MultiModularLibrary"
include(":app")
include(":myAARLibrary")
include(":myJARLibrary")
include(":myAARLocationSearchLibrary")
