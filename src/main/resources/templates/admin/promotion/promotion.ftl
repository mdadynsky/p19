<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Promotion</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/promotion/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>Название</th>
            <th>Описание</th>
            <th>Скидка</th>
        </tr>
        <tbody>
        <#list promotions as promotion>
            <tr>
                <td>
                    <a href="/admin/promotion/${promotion.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${promotion.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${promotion.id}</td>
                <td>${promotion.promotionName}</td>
                <td>${promotion.promotionDescription}</td>
                <td>${promotion.promotionPrice}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(promotionId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/promotion/" + promotionId + "/delete");
            }
        }
    </script>

</@layout.layout>