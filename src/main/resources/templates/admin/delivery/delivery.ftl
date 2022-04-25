<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Delivery</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/delivery/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>CompanyName</th>
        </tr>
        <tbody>
        <#list delivery as delivery>
            <tr>
                <td>
                    <a href="/admin/delivery/${delivery.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${delivery.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${delivery.id}</td>
                <td>${delivery.companyName}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(deliveryId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/delivery/" + deliveryId + "/delete");
            }
        }
    </script>
</@layout.layout>