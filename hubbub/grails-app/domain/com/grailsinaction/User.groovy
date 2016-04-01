package com.grailsinaction

class User {
    String loginId
    String password
    Date dateCreated
    static hasOne = [profile : Profile]
    static hasMany = [posts : Post, tags : Tag]

    static constraints = {
        loginId size:  3..20 , unique: true, nullable: false
        password size: 6..8, nullable: false, validator: {password, user ->
            user.loginId != password
        }
        profile nullable: true
    }
    static mapping = {
       posts sort: 'dateCreated'
    }
}
