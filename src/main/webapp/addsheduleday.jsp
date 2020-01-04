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

        <select required name="dayOfWeek">
            <option value="Monday">Monday</option>
            <option value="Tuesday">Tuesday</option>
            <option value="Wednesday">Wednesday</option>
            <option value="Thursday">Thursday</option>
            <option value="Friday">Friday</option>
            <option value="Saturday">Saturday</option>
            <option value="Sunday">Sunday</option>
        </select>

        <p><label for="lesson1">Lesson 1: </label> <input  type="text" id="lesson1" name="lesson1" placeholder="lesson name 1"></p>
        <p><label for="audience1">Audience 1: </label> <input  type="text" id="audience1" name="audience1" placeholder="audience number 1"></p>
        <p><label for="nameSurname1">Initials: </label> <input  type="text" id="nameSurname1" name="nameSurname1" placeholder="Initials"></p>

        <p><label for="lesson2">Lesson 2: </label> <input  type="text" id="lesson2" name="lesson2" placeholder="lesson name 2"></p>
        <p><label for="audience2">Audience 2: </label> <input  type="text" id="audience2" name="audience2" placeholder="audience number 2"></p>
        <p><label for="nameSurname2">Initials: </label> <input  type="text" id="nameSurname2" name="nameSurname2" placeholder="Initials"></p>

        <p><label for="lesson3">Lesson 3: </label> <input  type="text" id="lesson3" name="lesson3" placeholder="lesson name 3"></p>
        <p><label for="audience3">Audience 3: </label> <input  type="text" id="audience3" name="audience3" placeholder="audience number 3"></p>
        <p><label for="nameSurname3">Initials: </label> <input  type="text" id="nameSurname3" name="nameSurname3" placeholder="Initials"></p>

        <p><label for="lesson4">Lesson 4: </label> <input  type="text" id="lesson4" name="lesson4" placeholder="lesson name 4"></p>
        <p><label for="audience4">Audience 4: </label> <input  type="text" id="audience4" name="audience4" placeholder="audience number 4"></p>
        <p><label for="nameSurname4">Initials: </label> <input  type="text" id="nameSurname4" name="nameSurname4" placeholder="Initials"></p>

        <p><label for="lesson5">Lesson 5: </label> <input  type="text" id="lesson5" name="lesson5" placeholder="lesson name 5"></p>
        <p><label for="audience5">Audience 5: </label> <input  type="text" id="audience5" name="audience5" placeholder="audience number 5"></p>
        <p><label for="nameSurname5">Initials: </label> <input  type="text" id="nameSurname5" name="nameSurname5" placeholder="Initials"></p>

        <p><label for="lesson6">Lesson 6: </label> <input  type="text" id="lesson6" name="lesson6" placeholder="lesson name 6"></p>
        <p><label for="audience6">Audience 6: </label> <input  type="text" id="audience6" name="audience6" placeholder="audience number 6"></p>
        <p><label for="nameSurname6">Initials: </label> <input  type="text" id="nameSurname6" name="nameSurname6" placeholder="Initials"></p>
        <p><input type="submit" value="Create"></p>
    </div>
</form>
</body>
</html>
