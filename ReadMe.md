# Register and Login using Springboot, Thymeleaf and Mysql


1. Appply ManyToMany mapping on collection< Role> becoz we need to retrive role along with user (if you don't want you can use lazy) also apply cascade=CascadeType.ALL for do operation like persist,merge ,remove(whenver such operation is done on parent it will be done on child also)