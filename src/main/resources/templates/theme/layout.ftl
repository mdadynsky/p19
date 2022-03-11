<#import "/spring.ftl" as spring />

<#macro layout>
<html lang="ru">
<head>
    <title>Demo</title>
    <link href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" >
    <script src="/static/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1 class="pre">www</h1>
    <#nested/>
</body>
</html>
</#macro>