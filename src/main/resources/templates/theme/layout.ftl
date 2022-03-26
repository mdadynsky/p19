<#import "/spring.ftl" as spring />

<#macro layout>
<html>
<head>
    <meta charset="utf-8">
    <title>Demo</title>
    <link href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" >
    <link href="https://icons.getbootstrap.com/assets/font/bootstrap-icons.css" rel="stylesheet" >
    <link href="/static/style.css" rel="stylesheet" >

    <script src="/static/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
    <#nested/>
</body>
</html>
</#macro>