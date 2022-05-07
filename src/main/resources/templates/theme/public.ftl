<#import "/spring.ftl" as spring />

<#macro public>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" >
    <link href="https://icons.getbootstrap.com/assets/font/bootstrap-icons.css" rel="stylesheet" >
    <script src="/static/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-10">
            <a href="/">
                <img src="https://cdn1.ozone.ru/s3/cms/53/t73/wc200/logo-logo-ozon-blue-png_2.png" alt="Logo">
            </a>
        </div>
        <div class="col-sm-1">
            <a href="/login">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" class="ki2"><path fill="currentColor" d="M8 11a1 1 0 1 1-2 0 1 1 0 0 1 2 0Zm10 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0Zm-8.3 4.286c.016.015.185.165.5.323.376.187.971.391 1.8.391.829 0 1.425-.204 1.8-.391.175-.088.355-.19.5-.323a1 1 0 0 1 1.407 1.421C15.587 16.827 14.357 18 12 18c-2.358 0-3.587-1.173-3.707-1.293A1 1 0 0 1 9.7 15.286Z"></path><path fill="currentColor" d="M11 2a1 1 0 0 1 1-1c6.075 0 11 4.925 11 11s-4.925 11-11 11S1 18.075 1 12a11 11 0 0 1 6.23-9.914 1 1 0 0 1 1.36.524c.292.72.69 1.565 1.362 2.233C10.592 5.481 11.524 6 13 6a1 1 0 1 1 0 2c-2.024 0-3.458-.743-4.459-1.74-.6-.596-1.027-1.267-1.34-1.875A9 9 0 1 0 12 3a1 1 0 0 1-1.001-1Z"></path></svg>
            </a>
        </div>
        <div class="col-sm-1">
            <a href="/shopping/list.html">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" class="la"><path fill="currentColor" d="M6 6a4 4 0 0 1 4-4h4a4 4 0 0 1 4 4v2h4a1 1 0 0 1 .986 1.164l-1.582 9.494A4 4 0 0 1 17.46 22H6.54a4 4 0 0 1-3.945-3.342L1.014 9.164A1 1 0 0 1 2 8h4V6Zm2 2h5a1 1 0 1 1 0 2H3.18l1.389 8.329A2 2 0 0 0 6.54 20h10.92a2 2 0 0 0 1.972-1.671L20.82 10H17a1 1 0 0 1-1-1V6a2 2 0 0 0-2-2h-4a2 2 0 0 0-2 2v2Z"></path></svg>
            </a>
        </div>
    </div>
    <div class="row">
        <#nested/>
    </div>
    <div class="row"></div>
</div>

</body>
</html>
</#macro>