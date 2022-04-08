<!DOCTYPE html>

<html>
	<head>
		<title></title>
	</head>
	
	<body>
	
		<b>Sorry but it doesn't work :(</b>
		
		<br><br>
		
		JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("users.json");
		<br><br>
		public static Object readJsonSimpleDemo(String filename) throws Exception {<br>
	    FileReader reader = new FileReader(filename);<br>
	    JSONParser jsonParser = new JSONParser();<br>
	    return jsonParser.parse(reader);<br>
		
	</body>

</html>