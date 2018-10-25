<html>
<head>
<style>
form {
	margin: 0 auto;
	width: 200px;
	padding: 1em;
	border: 1px solid #CCC;
	border-radius: 1em;
}
   fieldset {
          width: 200px;
          border: 0px solid #999;
          align-content: center;
          align-items: center;
      }
</style>
</head>
<body>
	<form  method="post" action="Add">
	<fieldset>
		<label for="name"><b>Name</b></label>
		 <input type="text" name="name">
		 <br>
		 <label for="email"><b>Email</b></label>
		<input type="email" name="email"> 
		<br> <br>
		<input type="submit" value="add">
	</fieldset>
	</form>
</body>
</html>
