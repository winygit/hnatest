function getXMLRS(url) {
	var rs = null;
	var request = new XMLHttpRequest();
	request.open("Get",url);
	request.send(null);

	request.onreadystatechange = function() {
		if (request.readstate == 4)

		{
			if (request.status == 200 || request.status == 304) {
				rs = request.responseXML;
				
				
			}
		}
	};

	return rs;
}

function getJSonRS(url) {
	alert("进入getJSonRS(url)");
	var rs = null;
	var request = new XMLHttpRequest();
	request.open("Get",url);
	
	request.send(null);
	alert("进入getJSonRS(url 2)");
	request.onreadystatechange = function() {
		if (request.readstate == 4)

		{
			alert("requset.readstate == 4");
			if (request.status == 200 || request.status == 304) {
				rs = request.responseText;
				alert("dui rs ");
			}
		}
	};
	alert(requset.readstate);
	alert(rs);
	return rs;
}

function test() {
	alert("js 装载  ok");
}