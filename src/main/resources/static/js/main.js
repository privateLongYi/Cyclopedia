$(function () {

    var classify = "<tr>" +
                    "   <td>编号</td>" +
                    "   <td>名称</td>" +
                    "</tr>";

    //获取前八个百科分类
    $.ajax({
        url: "classify/GetEightCyClassify",async: false,
        success: function (data) {
        for(var i = 0; i < data.length; i++){
            classify += "<tr>" +
                        "   <td>"+data[i].cyClassifyId+"</td>" +
                        "   <td>"+data[i].cyType+"</td>" +
                        "</tr>";
        }
        $("#classify").html(classify);
    }});

    var push = "<tr>" +
                "   <td>编号</td>" +
                "   <td>词条名</td>" +
                "   <td>类型</td>" +
                "</tr>";

    //获取前八个内容推送
    $.ajax({
        url: "content/GetEightCyContent",async: false,
        success: function (data) {
        for(var i = 0; i < data.length; i++){
            push += "<tr>" +
                    "   <td>"+data[i].cyContentId+"</td>" +
                    "   <td>"+data[i].cyEntryName+"</td>" +
                    "   <td>"+data[i].cyTypeName+"</td>" +
                    "</tr>";
        }
        $("#push").html(push);
    }});

    var user = "<tr>" +
               "    <td>编号</td>" +
               "    <td>用户名</td>" +
               "    <td>密码</td>" +
               "    <td>是否启用</td>" +
               "</tr>";

    //获取前八个用户
    $.ajax({
        url: "user/GetEightUser",async: false,
        success: function (data) {
        for(var i = 0; i < data.length; i++){
            user += "<tr>" +
                    "   <td>"+data[i].userId+"</td>" +
                    "   <td>"+data[i].userName+"</td>" +
                    "   <td>"+data[i].password+"</td>" +
                    "   <td>"+data[i].isFlag+"</td>" +
                    "</tr>";
        }
        $("#user").html(user);
    }});

})