package com.grailsinaction

class User {
    String loginId
    String password
    String homepage
    Date dateCreated
    static hasOne = [profile : Profile]
    static hasMany = [posts : Post, tags : Tag]

    static constraints = {
        loginId size:  3..20 , unique: true, nullable: false
        password size: 6..8, nullable: false, validator: {password, user ->
            user.loginId != password
        }
        homepage url: true, nullable: true
        profile nullable: true
    }
    static mapping = {
       posts sort: 'dateCreated'
    }
}
