<!doctype html>
<html>
    <head>
        <title>JS-DB-DESIGNER</title>
        <script src="http://yui.yahooapis.com/3.15.0/build/yui/yui-min.js"></script>
        <script src="resources/js/jdd-app.js"></script>
    </head>
    <body class="yui3-skin-sam">
        <nav id="topmenu">NAV</nav>
        <div id="app"></div>
        <script type="text/javascript">
            YUI().use('jdd-app', function (Y) {
                var app = new Y.JDD.App({
                        container: '#app',
                        serverRouting: false,
                        transition: true
                    });

                app.render();
            });
        </script>
    </body>
</html>