<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>

</head>
<body>
<div class="container-fluid">
<div class="row">
<div style="background:pink" class="col-lg-6 offset-lg-3">
<h1>Hello!!</h1>
<br>
<label>Enter your Name :</label><input type="text" onkeyup="myfun()" id="name"><br>
You have entered: <span id="nameVal"></span>
<br>
<label>Enter your age: </label><input type="number" onkeyup="myfun1()" id="age"><br>
You have entered: <span id="ageVal"></span><br>
<button onclick="show()">Submit</button>
<script type="text/javascript">
function myfun(){
	var number = document.getElementById("name").value; 
	document.getElementById("nameVal").innerHTML=number;
}
function myfun1(){
	
	number=document.getElementById("age").value;
	document.getElementById("ageVal").innerHTML=number;
}
function show(){
	document.write("Your name is "+document.getElementById("name").value+", Your age is "+document.getElementById("age").value+".");
}
var obj=new Object();
</script>
</div>
</div>
</div>
</body>
</html>