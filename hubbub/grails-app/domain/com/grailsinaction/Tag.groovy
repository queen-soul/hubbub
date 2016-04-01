package com.grailsinaction

class Tag {
    static hasMany = [posts : Post]
    static belongsTo = [User, Post]

    static constraints = {
    }
}
