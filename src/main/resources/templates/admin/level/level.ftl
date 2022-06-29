<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Level</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/level/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>Название</th>
            <th>Общая сумма покупок, от р.</th>
        </tr>
        <tbody>
        <#list levels as level>
            <tr>
                <td>
                    <a href="/admin/level/${level.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${level.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${level.id}</td>
                <td>${level.levelName}</td>
                <td>${level.levelTotalAmountOfPurchases}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(levelId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/level/" + levelId + "/delete");
            }
        }
    </script>

</@layout.layout>