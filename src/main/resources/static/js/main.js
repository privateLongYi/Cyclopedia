$(function () {

    var classify = "<tr>" +
                    "   <td>编号</td>" +
                    "   <td>名称</td>" +
                    "</tr>";

    //获取前八个百科分类
    $.post("", function (data) {
        for(var i = 0; i < data.length; i++){
            classify += "<tr>" +
                        "   <td>"+data[i].cyClassifyId+"</td>" +
                        "   <td>"+data[i].cyType+"</td>" +
                        "</tr>";
        }
        $("#classify").html(classify);
    });

    var push = "<tr>" +
                "   <td>编号</td>" +
                "   <td>词条名</td>" +
                "   <td>类型</td>" +
                "</tr>";

    //获取前八个内容推送
    $.post("", function (data) {
        for(var i = 0; i < data.length; i++){
            push += "<tr>" +
                    "   <td>"+data[i].cyContentId+"</td>" +
                    "   <td>"+data[i].cyEntryname+"</td>" +
                    "   <td>"+data[i].cyTypeName+"</td>" +
                    "</tr>";
        }
    });

    //获取前八个用户
    $.post("", function (data) {
        for(var i = 0; i < data.length; i++){
            push += "<tr>" +
                    "   <td>"+data[i].userId+"</td>" +
                    "   <td>"+data[i].userName+"</td>" +
                    "   <td>"+data[i].password+"</td>" +
                    "   <td>"+data[i].isFlag+"</td>" +
                    "</tr>";
        }
    });

})