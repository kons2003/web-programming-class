<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2</title>
</head>
<body>
	<div>
		<form method="post">
			<div>
				<select name="numString">
					<option value="one" ${numString == "one" ? "selected" : ""}>one</option>
					<option value="two" ${numString == "two" ? "selected" : ""}>two</option>
					<option value="three" ${numString == "three" ? "selected" : ""}>three</option>
				</select>
			</div>
			<div>
				<input type="text" value="${result}" />
			</div>
			<div>
				<button type="submit">Ok</button>
			</div>
		</form>
	</div>
</body>
</html>