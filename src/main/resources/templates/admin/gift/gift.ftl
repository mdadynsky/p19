<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Gift</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/gift/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>Название</th>
            <th>Описание</th>
            <th>Скидка</th>
        </tr>
        <tbody>
        <#list gifts as gift>
            <tr>
                <td>
                    <a href="/admin/gift/${gift.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${gift.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${gift.id}</td>
                <td>${gift.giftName}</td>
                <td>${gift.giftDescription}</td>
                <td>${gift.giftPrice}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(giftId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/gift/" + giftId + "/delete");
            }
        }
    </script>
.
</@layout.layout>