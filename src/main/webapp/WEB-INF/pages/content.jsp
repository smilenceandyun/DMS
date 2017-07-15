<%--
  Created by IntelliJ IDEA.
  User: laoli
  Date: 2017/6/29
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>hsweb 企业后台管理系统基础框架</title>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <script type="text/javascript">window.BASE_PATH = "http://localhost:8082/"</script>
    <script src="http://localhost:8082/ui/plugins/jquery/1.11.1/jquery.min.js" type="text/javascript"></script>
    <script src="http://localhost:8082/ui/resources/js/miniui-global.js" type="text/javascript"></script>
    <script src="http://localhost:8082/ui/plugins/miniui/miniui.js" type="text/javascript"></script>
    <link href="http://localhost:8082/ui/plugins/miniui/themes/default/miniui.css" rel="stylesheet" type="text/css"></link>
    <link href="http://localhost:8082/ui/plugins/miniui/themes/icons.css" rel="stylesheet" type="text/css"></link>
    <link href="http://localhost:8082/ui/plugins/miniui/themes/pure/skin.css" rel="stylesheet" type="text/css"></link>
    <link href="http://localhost:8082/ui/resources/theme/css/default/theme.css" rel="stylesheet" type="text/css"></link>
    <link href="http://localhost:8082/ui/resources/icons/css/font-awesome.min.css" rel="stylesheet" type="text/css"></link>
    <link href="http://localhost:8082/ui/resources/css/index.css" rel="stylesheet" type="text/css"></link>
    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            border: 0;
            width: 100%;
            height: 100%;
            overflow: hidden;
        }

        .font-2x {
            font-size: 16px;;
        }
    </style>
</head>
<body>
<div id="layout1" class="mini-layout" style="width:100%;height:100%;">
    <div class="header" region="north" height="75" showSplit="false" showHeader="false" splitSize="6">
        <div id="headerLayout" style="width:100%;height:73px;">
            <div class="header" style="background-color:rgb(1,104,183) " region="north" height="72" showSplit="false" splitSize="4" showHeader="false">
                <div style="width:100%;height:70px; ">
                    <h1 style="margin:0;padding:18px;font-size: 30px; cursor:default;font-family:微软雅黑,黑体,宋体;color: white;">
                        hsweb 企业后台管理系统
                    </h1>
                    <div class="top-menu" style="position:absolute;top:25px;right:10px;color: white;font-size: 15px;">
                        <a class="link" onclick=" window.onbeforeunload=function(){};window.location.reload()">
                            <i class="fa fa-home"></i>首页
                        </a>
                        |
                        <a class="link" onclick="showTips('建设中..')">
                            <i class="fa fa-book"></i>
                            帮助
                        </a>
                        |
                        <a class="link" onclick="settings()">
                            <i class="fa fa-gear"></i>
                            设置
                        </a>
                        |
                        <a class="link" onclick="exit()">
                            <i class="fa fa-sign-out"></i>
                            注销
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div title="south" region="south" showSplit="false" showHeader="false" height="30">
        <div style="line-height:28px;text-align:center;cursor:default;color: white; background-color:rgb(1,121,183)">
            你好,&nbsp;超级管理员&nbsp;2017年06月29日 星期四 当前在线人数:<span class="online-total">-</span>人
        </div>
    </div>
    <div showHeader="true" title="导航" region="west" width="180" height="100%" maxWidth="250" minWidth="100">
        <div id="leftTree" class="mini-tree" url="http://localhost:8082/userModule"
             expandOnLoad="true" resultAsTree="false" ajaxOptions="{type:'GET'}" showTreeIcon="true" iconField="icon"
             onnodeclick="nodeselect" idField="id" parentField="parentId" textField="name" borderStyle="border:0">
        </div>
    </div>
    <div title="center" region="center" bodyStyle="overflow:hidden;">
        <!--默认标签页-->
        <div id="mainTabs" closeclick="oncloseclick" class="mini-tabs" activeIndex="0" style="width:100%;height:100%;">
            <div title="首页" name="first" url="/admin/indexTab.html" style="text-align: center;width: 100%;margin: auto;">

            </div>
        </div>
    </div>
</div>
</body>
<!--[if lt IE 9]>
<script src="../statics/jss/json2.js" type="text/javascript"></script>
<![endif]-->
<script src="../statics/jss//Request.js" type="text/javascript"></script>
<script type="text/javascript">Request.BASH_PATH = "http://localhost:8082/";</script>
<script src="../statics/jss//websocket.js" type="text/javascript"></script>
<script type="text/javascript">
    Socket.URL = "http://localhost:8082/".replace("http", "ws") + "socket";
    if (Socket.URL.indexOf("/") == 0) Socket.URL = "ws://" + window.location.host + Socket.URL;
</script>
<script src="../statics/jss//Socket.js" type="text/javascript"></script>
</html>
<script>
    mini.parse();
    var tabs = mini.get('mainTabs');
    var tree = mini.get("leftTree");

    if (window.location.hash) {
        var node = tree.getNodesByValue(window.location.hash.substring(1));
        if (node) {
            tree.selectNode(node[0]);
            showTab(node[0]);
        }
    }
    function showTablById(id) {
        var node = tree.getNodesByValue(id);
        if (node) {
            showTab(node);
        }
    }
    function nodeselect(e) {
        if (e.node && e.node.id != "-1" && $.trim(e.node.uri) != "") {
            if (window.history.pushState)
                window.history.pushState(0, 0, "#" + e.node.id);
            showTab(e.node);
            return;
        }
    }
    function drawnode(e) {
        e.nodeHtml = "<i class='" + (e.node.icon) + " font-2x'>&nbsp;" + e.node.name + "</i> &nbsp;";
    }
    function showTab(node) {
        var id = "tab$" + node.id;
        var tab = tabs.getTab(id);
        if (!tab) {
            tab = {};
            tab.name = id;
            tab.title = node.name;
            tab.showCloseButton = true;
            tab.url = Request.BASH_PATH + node.uri;
            tabs.addTab(tab);
        }
        if (!mini.get("layout1").isExpandRegion("west"))
            mini.get("layout1").collapseRegion("west");
        tabs.activeTab(tab);
    }
    function exit() {
        mini.confirm("确定退出系统?", "确定？",
            function (action) {
                if (action == "ok") {
                    Request.post("exit", {}, function (e) {
                        window.location.href = "/admin/index.html";
                    });
                }
            }
        );
    }
    Request.get("online/total", function (e) {
        if (e.success) {
            $(".online-total").text(e.data);
        }
    });
    Socket.open(function (socket) {
        if (socket) {
            //订阅在线人数推送
            socket.sub("online", {type: "total"}, "onlineUserTotal");
            socket.on("onlineUserTotal", function (e) {
                $(".online-total").text(e);
            });
        } else {
            showTips("你的浏览器不支持websocket,部分功能可能无法正常使用!", "danger");
        }
    });
</script>