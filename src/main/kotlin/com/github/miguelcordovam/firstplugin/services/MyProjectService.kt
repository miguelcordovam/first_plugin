package com.github.miguelcordovam.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.miguelcordovam.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
