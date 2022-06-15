<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Points</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/points/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>Город</th>
            <th>Адрес</th>
            <th>Цена</th>
        </tr>
        <tbody>
        <#list pointes as points>
            <tr>
                <td>
                    <a href="/admin/points/${points.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${points.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${points.id}</td>
                <td>${points.pointsName}</td>
                <td>${points.pointsDescription}</td>
                <td>${points.pointsPrice}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(pointsId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/points/" + pointsId + "/delete");
            }
        }
    </script>

</@layout.layout>