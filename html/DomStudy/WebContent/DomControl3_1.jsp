<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div id="theBox">
		<h1>요소 생성 연습</h1>
		<button id="btn" onclick="h1TagMaker();">나를 마우스 왼쪽 클릭하면 h1태그가 생겨</button>
	</div>
	
	<div id="h1Container">
<!-- 		<h1>새로 만들어진 태그1</h1> -->
<!-- 		<h1>새로 만들어진 태그1</h1> -->
<!-- 		<h1>새로 만들어진 태그1</h1> -->
<!-- 		<h1>새로 만들어진 태그1</h1> -->
	
<!-- 		<h1>새로 만들어진 태그1</h1> -->
<!-- 		<h1>새로 만들어진 태그2</h1> -->
<!-- 		<h1>새로 만들어진 태그3</h1> -->
<!-- 		<h1>새로 만들어진 태그4</h1> -->
	</div>
	
</body>

<script type="text/javascript">
/*  12345 로 만들어지게하는 코드(대성씨 코드) */
	var cnt = 0;
	
	function h1TagMaker() {
	   cnt++;
	   var newDiv = document.getElementById('h1Container');
	   var newH1Tag = document.createElement('h1');
	   var newH1TagText = document.createTextNode('새로 만들어진 태그'+ cnt);
	   newH1Tag.appendChild(newH1TagText);
	   newDiv.appendChild(newH1Tag);
	}

		
	



</script>
</html>