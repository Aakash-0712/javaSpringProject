<!-- ************ This is steps how we make spring_jdbc projects *************** --!>
<!-- steps to create SPRING_JDBC PROJECTS. -->
<!-- pom.xml (dependencies) -->
<!-- then make (-servlet.xml file in WEB-INF)=> here it's name springmvc-servlet.xml -->
<!-- then web.xml  -->
<!-- then in main, create user.java in package -->
<!-- then UserDao(interface) -->
<!-- then UserDaoImpl(class file) -->
<!-- then UserService(interface) -->
<!-- then UserServiceImpl(class file) -->
<!-- then UserController(class file) -->
<!-- then make folder view in WEB-INF; then make jsp file in it. -->
<!-- then home.jsp  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="register">Add Student</a>
<a href="showdata">show Student</a>
</body>
</html>