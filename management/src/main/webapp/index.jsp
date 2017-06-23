<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>欢迎登陆学生管理系统</title>
<script
	src="${pageContext.request.contextPath }/static/js/jquery-1.8.0.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath }/static/js/jquery.easyui.min.js"
	type="text/javascript"></script>
<link
	href="${pageContext.request.contextPath }/static/css/themes/default/easyui.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/static/css/themes/icon.css"
	rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	$(function() {
		doSearch();
		$('#regularGrade').bind('input propertychange', function() {
			var regularGrade=$("#regularGrade").val();
		    var majorGrade=$("#majorGrade").val();
		    var finalGrade=$("#finalGrade").val();
		    var result=Number(0);
		    if(!isNaN(regularGrade)){
		    	result+=Number(regularGrade);
		    }
		    if(!isNaN(finalGrade)){
		    	result+=Number(finalGrade);
		    }
		    if(!isNaN(majorGrade)){
		    	result+=Number(majorGrade);
		    }
		    
		    if(!isNaN(result)){
		    	$("#totalGrade").html(result);
		    }
		});
		$('#majorGrade').bind('input propertychange', function() {
			var regularGrade=$("#regularGrade").val();
		    var majorGrade=$("#majorGrade").val();
		    var finalGrade=$("#finalGrade").val();
		    var result=Number(0);
		    if(!isNaN(regularGrade)){
		    	result+=Number(regularGrade);
		    }
		    if(!isNaN(finalGrade)){
		    	result+=Number(finalGrade);
		    }
		    if(!isNaN(majorGrade)){
		    	result+=Number(majorGrade);
		    }
		    
		    if(!isNaN(result)){
		    	$("#totalGrade").html(result);
		    }
		});
		$('#finalGrade').bind('input propertychange', function() {
			var regularGrade=$("#regularGrade").val();
		    var majorGrade=$("#majorGrade").val();
		    var finalGrade=$("#finalGrade").val();
		    var result=Number(0);
		    if(!isNaN(regularGrade)){
		    	result+=Number(regularGrade);
		    }
		    if(!isNaN(finalGrade)){
		    	result+=Number(finalGrade);
		    }
		    if(!isNaN(majorGrade)){
		    	result+=Number(majorGrade);
		    }
		    
		    if(!isNaN(result)){
		    	$("#totalGrade").html(result);
		    }
		});
	});

	function doSearch() {
		var url = "${pageContext.request.contextPath}/student/all";
		$("#dg")
				.datagrid(
						{
							iconCls : 'icon-save',
							nowrap : true,
							striped : true,
							border : true,
							url : url,
							rownumbers : true,
							pagination : true,
							singleSelect : false,
							idField : 'id',
							height : 200,
							width : 668,
							pageList : [ 5, 10, 20 ],
							pageSize : 5,
							pageNumber : 1,
							columns : [ [
									{
										field : "studentId",
										title : "学号",
										align : "center",
										width : 100
									},
									{
										field : "studentName",
										title : "姓名",
										align : "center",
										width : 100
									},
									{
										field : "majorName",
										title : "专业",
										align : "center",
										width : 100
									},
									{
										field : "gradeName",
										title : "年级",
										align : "center",
										width : 100
									},
									{
										field : "null",
										title : "操作",
										align : "center",
										width : 235,
										formatter : function(val, data, ind) {
											var re = "";
											re = '<a  href="javascript:deleteSutdent(\''+ data.id+ '\')">删除</a>&nbsp;'
											re += '<a  href="javascript:modifyStudent(\''+ data.id+ '\',\''+ind+'\')">编辑</a>&nbsp;'
											re += '<a  href="javascript: editGrade(\''+ data.id+ '\')">成绩</a>&nbsp;'
											return re;
										}
									} ] ],
							toolbar : [ {
								text : '添加',
								iconCls : 'icon-add',
								handler : function() {
									addStudent();
								}
							}, '-', {
								text : '导入',
								iconCls : 'icon-add',
								handler : function() {
									addMoreStudents();
								}
							} ]
						});
	}
</script>
<style type="text/css">
#fm {
	margin: 0;
	padding: 10px 30px;
}

.ftitle {
	font-size: 14px;
	font-weight: bold;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}

.fitem {
	margin-bottom: 5px;
}

.fitem label {
	display: inline-block;
	width: 80px;
}
.fitem p {
	display: inline-block;
}
</style>
</head>
</head>
<body>
	<div style="margin: 0 auto">
		<h2>选课管理</h2>
		<table id="dg"></table>
		<div id="dlg" class="easyui-dialog" style="width: 400px; height: 280px; padding: 10px 20px;" closed="true" buttons="#dlg-buttons">
			<div class="ftitle">学生信息编辑</div>
			<form id="fm" method="post">
				<div class="fitem">
					<label>学号</label> <input name="studentId" class="easyui-validatebox" required="true" />
				</div>
				<div class="fitem">
					<label>姓名</label> <input name="studentName" class="easyui-validatebox" required="true" />
				</div>
				<div class="fitem">
					<label>专业</label> <input name="majorName" class="easyui-validatebox" required="true" />
				</div>
				<div class="fitem">
					<label> 年级</label> <input name="gradeName" class="easyui-validatebox" required="true" />
				</div>
				<input type="hidden" name="id" id="s_id" />
				<input type="hidden" name="action" id="hidtype" />
			</form>
		</div>
		<div id="dlg-buttons">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="saveStudent()" iconcls="icon-save">保存</a> 
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg').dialog('close')" iconcls="icon-cancel">取消</a>
		</div>
		<div id="dlg2" class="easyui-dialog" style="width: 400px; height: 280px; padding: 10px 20px;" closed="true" buttons="#dlg-buttons2">
			<div class="ftitle">录入成绩信息</div>
			<form id="fm2" method="post">
				<div class="fitem">
					<label>平时</label> <input name="regularGrade" class="easyui-validatebox" required="true" id="regularGrade"/>
				</div>
				<div class="fitem">
					<label>大作业</label> <input name="majorGrade" class="easyui-validatebox" required="true" id="majorGrade" />
				</div>
				<div class="fitem">
					<label>期末</label> <input name="finalGrade" class="easyui-validatebox" required="true" id="finalGrade" />
				</div>
				<div class="fitem">
					<label>总分</label> <p id="totalGrade" />
				</div>
				<input type="hidden" name="sId" id="s_id2" />
				<input type="hidden" name="action" id="hidtype2" />
			</form>
		</div>
		<div id="dlg-buttons2">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="saveGrade()" iconcls="icon-save">保存</a> 
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg2').dialog('close')" iconcls="icon-cancel">取消</a>
		</div>
		<div id="dlg3" class="easyui-dialog" style="width: 400px; height: 130px; padding: 10px 20px;" closed="true" buttons="#dlg-buttons3">
			<form id="fm3" enctype="multipart/form-data" method="post">
				<div class="fitem">
					<label>文件</label> <input name="fileName" id="fileName" type="file" accept="xlsx" size="80"/>
				</div>
				<input type="hidden" name="action" id="hidtype3" />
			</form>
		</div>
		<div id="dlg-buttons3">
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="saveExcel()" iconcls="icon-save">导入</a> 
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg3').dialog('close')" iconcls="icon-cancel">取消</a>
		</div>
	</div>
</body>
<script type="text/javascript">
	var url;
	function addStudent() {
		$("#dlg").dialog("open").dialog('setTitle', '录入学生信息');
		;
		$("#fm").form("clear");
		url = "${pageContext.request.contextPath}/student/add";
		document.getElementById("hidtype").value = "submit";
	}
	function modifyStudent(id,ind) {
		var row = $('#dg').datagrid('getData').rows[ind];
		$("#dlg").dialog("open").dialog('setTitle', '修改用户信息');
		$("#fm").form("load", row);
		document.getElementById("s_id").value = id;
		url = "${pageContext.request.contextPath}/student/modify";
	}
	function saveStudent() {
		$("#fm").form("submit", {
			url : url,
			onsubmit : function() {
				return $(this).form("validate");
			},
			success : function(result) {
				if (result == "1") {
					$.messager.alert("提示信息", "操作成功");
					$("#dlg").dialog("close");
					$("#dg").datagrid("load");
				} else {
					$.messager.alert("提示信息", "操作失败");
				}
			}
		});
	}
	function deleteSutdent(id) {
		$.messager.confirm('Confirm',
				'确实要删除该学生信息?', function(r) {
					if (r) {
						$.post("${pageContext.request.contextPath }/student/del", {
							id : id
						}, function(result) {
							if (result.success) {
								$('#dg').datagrid('reload'); // reload the user data  
							} else {
								$.messager.show({ // show error message  
									title : 'Error',
									msg : result.errorMsg
								});
							}
						}, 'json');
					}
		});
	}
	var url2;
	function editGrade(id) {
		$("#dlg2").dialog("open").dialog('setTitle', '录入学生成绩');
		;
		$("#fm2").form("clear");
		url2 = "${pageContext.request.contextPath}/student/editGrade";
		document.getElementById("s_id2").value = id;
		document.getElementById("hidtype2").value = "submit";
	}
	
	function saveGrade() {
		$("#fm2").form("submit", {
			url : url2,
			onsubmit : function() {
				return $(this).form("validate");
			},
			success : function(result) {
				if (result == "1") {
					$.messager.alert("提示信息", "操作成功");
					$("#dlg2").dialog("close");
					$("#dg").datagrid("load");
				} else {
					$.messager.alert("提示信息", "操作失败");
				}
			}
		});
	}
	
	var url3;
	function addMoreStudents() {
		$("#dlg3").dialog("open").dialog('setTitle', '导入');
		;
		$("#fm3").form("clear");
		url3 = "${pageContext.request.contextPath}/student/addExcel";
		document.getElementById("hidtype3").value = "submit";
	}
	
	function saveExcel() {
		$("#fm3").form("submit", {
			url : url3,
			onsubmit : function() {
				return $(this).form("validate");
			},
			success : function(result) {
				if (result == "1") {
					$.messager.alert("提示信息", "操作成功");
					$("#dlg3").dialog("close");
					$("#dg").datagrid("load");
				} else {
					$.messager.alert("提示信息", "操作失败");
				}
			}
		});
	}
</script>
</html>
