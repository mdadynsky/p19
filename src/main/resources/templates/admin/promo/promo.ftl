<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Promo</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/promo/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>Название</th>
            <th>Описание</th>
            <th>Цена</th>
        </tr>
        <tbody>
        <#list promos as promo>
            <tr>
                <td>
                    <a href="/admin/promo/${promo.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${promo.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${promo.id}</td>
                <td>${promo.promoName}</td>
                <td>${promo.promoDescription}</td>
                <td>${promo.promoPrice}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(promoId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/promo/" + promoId + "/delete");
            }
        }
    </script>

</@layout.layout>