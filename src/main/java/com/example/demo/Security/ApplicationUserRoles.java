package com.example.demo.Security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demo.Security.ApplicationUserPermission.*;

public enum ApplicationUserRoles {

    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(STUDENT_READ, STUDENT_WRITE, COURSE_READ, COURSE_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRoles(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
