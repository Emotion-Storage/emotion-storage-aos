// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
    alias(libs.plugins.google.devtools.ksp) apply false
    alias(libs.plugins.google.dagger.hilt.android) apply false

    /**
     * # module dependency graph generator
     * - Graphviz installation needed
     *   https://graphviz.org/download/
     * - command to generate project dependency graph:
     *  ./gradlew generateDependencyGraph
     *  ./gradlew generateProjectDependencyGraph
     * - results saved in ./build/reports/projects-dependency-graph
     */
    alias(libs.plugins.vanniktech.dependency.graph.generator)
}