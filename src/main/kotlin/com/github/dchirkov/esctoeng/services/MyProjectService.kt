package com.github.dchirkov.esctoeng.services

import com.intellij.openapi.project.Project
import com.github.dchirkov.esctoeng.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
