<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Students Home</title>
</head>
<body>
<h1>Search Students</h1>
<button class="btn" onclick=location.href='/students/'>Show all students</button>
<br>
<br>
<button class="btn" onclick=location.href='/students/1/'>Show all courses for a specific student</button>
<br>
<br>
<button class="btn" onclick=location.href='/students/{}/luca/'>Search student by firstname </button>
<br>
<br>
<button class="btn" onclick=location.href='/students/{}/{}/arce/'>Search student by lastname </button>
<br>
<br>
<button class="btn" onclick=location.href='/students/{}/{}/{}/falsterbo/'>Search student by town </button>
<br>
<br>
<hr>
<br>
<h1>Add Student</h1>
<p>${message}</p>
<form id="createStudents" action="/createStudents" method="POST">
    <label for="fname" >fName</label>
    <input type="text" id="fname" name="fname" required>    <br>
    <label for="lname">lName</label>
    <input type="text" id="lname" name="lname" required>    <br>
    <label for="town">town</label>
    <input type="text" id="town" name="town" required>    <br>
    <br>
    <input class="btn" type="submit" value="CREATE STUDENT"><br>
</form>

<br>
<hr>
<br>

<h1>Remove Student</h1>
<form action="removeStudents" method="POST">
    id <input type="text" name="id" required>
    <br>
    <br>
    <input class="btn" type="submit" value="REMOVE STUDENT">
</form>
<br>
<hr>
<br>

<form id="createStudentsToCourses" action="/createStudentsToCourses" method="POST">
    <label for="students_id" >Student ID</label>
        id <input type="text" name="students_id" required>

    <label for="courses_id">Course ID</label>
    <input type="text" id="courses_id" name="courses_id" required>    <br>
 <br>
    <input class="btn" type="submit" value="ADD STUDENT TO COURSE"><br>

</form>
<br>
<br>
<button class="btn" onclick=location.href='/'>GO BACK HOME</button>
</body>
</html>