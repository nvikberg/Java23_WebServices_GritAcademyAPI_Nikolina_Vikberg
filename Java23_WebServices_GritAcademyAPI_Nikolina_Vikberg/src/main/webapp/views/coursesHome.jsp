<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Courses Home</title>
</head>
<body>

<h1>Search Courses</h1>
<button class="btn" onclick=location.href='/courses/'>Show all courses</button>
<br>
<br>
<button class="btn" onclick=location.href='/courses/1/'>Show all courses with ID</button>
<br>
<br>
<button class="btn" onclick=location.href='/courses/{}/java/'>Search by course name</button>
<br>
<br>
<button class="btn" onclick=location.href='/courses/{}/{}/medi/'>Seacrh by description</button>
<br>
<br>
<hr>
<br>
<h1>Add Course</h1>
<p>${message}</p>
<form id="createCourses" action="/createCourses" method="POST">
    <label for="CourseName" >name</label>
    <input type="text" id="name" name="name" required>    <br>
    <label for="Points">points</label>
    <input type="text" id="points" name="points" required>    <br>
    <label for="Description">description</label>
    <input type="text" id="description" name="description" required>    <br>
    <br>
    <input class="btn" type="submit" value="CREATE COURSE"><br>
</form>
<br>
<hr>
<br>
<h1>Remove Course</h1>
<form action="removeCourses" method="POST">
    id <input type="text" name="id" required>
    <br>
    <br>
    <input class="btn" type="submit" value="REMOVE COURSE">
</form>
<br>
<hr>
<br>
<button class="btn" onclick=location.href='/'>GO BACK HOME</button>





</body>
</html>