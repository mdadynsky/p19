<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>PromoCode</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/promocode/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th scope="col">#</th>
            <th scope="col">Название промокода</th>
            <th scope="col">Скидка, %</th>
            <th scope="col">Промокод</th>
        </tr>
        <tbody>
        <#list promoCodes as promoCode>
            <tr>
                <td>
                    <a href="/admin/promocode/${promoCode.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${promoCode.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${promoCode.id}</td>
                <td>${promoCode.promoCodeName}</td>
                <td>${promoCode.promoCodeDiscount}</td>
                <td>${promoCode.promoCodeNumbers}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(promoCodeId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/promocode/" + promoCodeId + "/delete");
            }
        }
    </script>

</@layout.layout>