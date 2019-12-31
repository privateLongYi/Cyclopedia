$(function () {
    $.post("getMenu", function (data) {

        var html = "<div class='panel panel-default'>" +
                    "     <div class='panel-heading'>";

        //遍历数据
        for (var i = 0; i < data.length; i++){

            html += "   <a class='open-menu green-left' href=#collapse" + i +
                    "       data-toggle='collapse' data-parent='#accordion'>" +
                    "       <spann th:class='glyphicon glyphicon-cog'></span>" +
                    "       <span>" + data[i].name + "</span>" +
                    "       <span class='glyphicon glyphicon-menu-left pull-right'></span>" +
                    "   </a>" +
                    "</div>" +
                    "<div id=collapse"+i+" class='panel-collapse collapse'>" +
                    "   <ul>";

            if (data[i].subset.length > 0) {
                for (var j = 0; j < data[i].subset.length; j++) {
                    html += "<li>" +
                            "   <a href='javascript:void(0);' onclick='changepath(&quot;" + data[i].subset[j].url + "&quot;)'>" +
                            "       <span class='glyphicon glyphicon-record'></span>" +
                            "       <span>" + data[i].subset[j].name + "</span>" +
                            "   </a>" +
                            "</li>";
                }
            }

            html += "          </ul>" +
                    "     </div>" +
                    "</div>";

        }

        $("#accordion").html(html);

    });
})