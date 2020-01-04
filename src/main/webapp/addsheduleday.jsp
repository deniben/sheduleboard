<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 1/4/2020
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Shedule Day</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addsheduleday" method="post" id="addSheduleDayForm">
    <div class="panel-body">
        <legend style="text-align: center">Add Shedule Day</legend>
        <p><label for="group">Group: </label> <input required type="text" id="group" name="group" placeholder="group number"></p>

        <p><label for="lesson1">Lesson 1: </label> <input required type="text" id="lesson1" name="lesson1" placeholder="lesson name 1"></p>
        <p><label for="audience1">Audience 1: </label> <input required type="text" id="audience1" name="audience1" placeholder="audience number 1"></p>
        <p><label for="nameSurname1">Initials: </label> <input required type="text" id="nameSurname1" name="nameSurname1" placeholder="Initials"></p>

        <p><label for="lesson2">Lesson 2: </label> <input required type="text" id="lesson2" name="lesson2" placeholder="lesson name 2"></p>
        <p><label for="audience2">Audience 2: </label> <input required type="text" id="audience2" name="audience2" placeholder="audience number 2"></p>
        <p><label for="nameSurname2">Initials: </label> <input required type="text" id="nameSurname2" name="nameSurname2" placeholder="Initials"></p>

        <p><label for="lesson3">Lesson 3: </label> <input required type="text" id="lesson3" name="lesson3" placeholder="lesson name 3"></p>
        <p><label for="audience3">Audience 3: </label> <input required type="text" id="audience3" name="audience3" placeholder="audience number 3"></p>
        <p><label for="nameSurname3">Initials: </label> <input required type="text" id="nameSurname3" name="nameSurname3" placeholder="Initials"></p>
        <p><input type="submit" value="Create"></p>
    </div>
</form>
</body>
</html>
