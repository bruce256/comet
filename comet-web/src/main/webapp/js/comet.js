/**
 * 
 */

function poll(){
	$.ajax({
		url : "http://127.0.0.1/poll",

		data : {"id" : 5},

		type : "POST",

		success : function(data, textStatus, jqXHR) {
			if (data == "true") {
				alert("添加成功");
			} else {
				alert("添加失败");
			}
			poll();
		},

		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("添加失败");
			poll();
		}
	});
}