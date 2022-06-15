<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>City</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/city/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>Название</th>
            <th>Область</th>
            <th>Склады</th>
        </tr>
        <tbody>
        <#list cities as city>
            <tr>
                <td>
                    <a href="/admin/city/${city.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${city.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${city.id}</td>
                <td>${city.cityName}</td>
                <td>${city.cityRegion}</td>
                <td>${city.cityWarehouses}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(cityId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/city/" + cityId + "/delete");
            }
        }
    </script>

</@layout.layout>