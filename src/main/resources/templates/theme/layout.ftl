<#import "/spring.ftl" as spring />

<#macro layout>
<html>
<head>
    <meta charset="utf-8">
    <title>Demo</title>
    <link href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet" >
    <link href="https://icons.getbootstrap.com/assets/font/bootstrap-icons.css" rel="stylesheet" >
    <link href="/static/sidebars.css" rel="stylesheet" >

    <link href="/static/style.css" rel="stylesheet" >
    <link href="/static/theme/css/sb-admin-2.css" rel="stylesheet" >

    <script src="/static/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <script src="/static/sidebars.js"></script>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-2">
                <div class="flex-shrink-0 p-3 bg-white" style="width: 280px;">
                    <a href="/" class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
                        <svg class="bi me-2" width="30" height="24"><use xlink:href="#bootstrap"></use></svg>
                        <span class="fs-5 fw-semibold">Collapsible</span>
                    </a>
                    <ul class="list-unstyled ps-0">
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
                                Home
                            </button>
                            <div class="collapse show" id="home-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="#" class="link-dark rounded">Overview</a></li>
                                    <li><a href="#" class="link-dark rounded">Updates</a></li>
                                    <li><a href="#" class="link-dark rounded">Reports</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="true">
                                Dashboard
                            </button>
                            <div class="collapse show" id="dashboard-collapse" style="">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="#" class="link-dark rounded">Overview</a></li>
                                    <li><a href="#" class="link-dark rounded">Weekly</a></li>
                                    <li><a href="#" class="link-dark rounded">Monthly</a></li>
                                    <li><a href="#" class="link-dark rounded">Annually</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
                                Orders
                            </button>
                            <div class="collapse" id="orders-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="#" class="link-dark rounded">New</a></li>
                                    <li><a href="#" class="link-dark rounded">Processed</a></li>
                                    <li><a href="#" class="link-dark rounded">Shipped</a></li>
                                    <li><a href="#" class="link-dark rounded">Returned</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="border-top my-3"></li>
                        <li class="mb-1">
                            <button class="btn btn-toggle align-items-center rounded" data-bs-toggle="collapse"
                                    data-bs-target="#account-collapse" aria-expanded="false">
                                Администрирование
                            </button>
                            <div class="collapse" id="account-collapse">
                                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                    <li><a href="/admin/user/create" class="link-dark rounded">Создать пользователя</a>
                                    </li>
                                    <li><a href="/admin/user/users" class="link-dark rounded">Список пользователей</a>
                                    </li>
                                    <li><a href="/admin/category/categories" class="link-dark rounded">Список категорий</a>
                                    </li>
                                    <li><a href="/admin/branch/branch" class="link-dark rounded">Список филиалов</a>
                                    </li>
                                    <li><a href="/admin/promo/create" class="link-dark rounded">Добавить промо-акцию</a>
                                    </li>
                                    <li><a href="/admin/promo/promo" class="link-dark rounded">Список промо-акций</a>
                                    </li>
                                    <li><a href="/admin/producer/create" class="link-dark rounded">Добавить
                                            производителя</a>
                                    </li>
                                    <li><a href="/admin/producer/producers" class="link-dark rounded">Список
                                            производителей</a>
                                    </li>
                                    <li><a href="/admin/delivery/create" class="link-dark rounded">Добавить компании по
                                            доставке</a>
                                    </li>
                                    <li><a href="/admin/delivery/delivery" class="link-dark rounded">Список компаний по
                                            доставке</a>
									</li>
									<li><a href="/admin/country/create" class="link-dark rounded">Добавить страну</a>
                                    </li>
                                    <li><a href="/admin/country/country" class="link-dark rounded">Список стран</a>
                                    </li>
                                    <li><a href="/admin/tags/tags" class="link-dark rounded">Список тегов</a>
                                    </li>
                                    <li><a href="/admin/city/create" class="link-dark rounded">Добавить город</a>
                                    </li>
                                    <li><a href="/admin/city/city" class="link-dark rounded">Список городов</a>
                                    </li>
                                    <li><a href="/admin/report/geoChat" class="link-dark rounded">Google chat</a></li>
                                    <li><a href="#" class="link-dark rounded">Profile</a></li>
                                    <li><a href="#" class="link-dark rounded">Settings</a></li>
                                    <li><a href="/logout.html" class="link-dark rounded">Выход</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-10">
                <#nested/>
            </div>
        </div>

    </div>
</body>
</html>
</#macro>