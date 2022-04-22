<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Список производителей</h1>

    <table class="table">
        <tr>
            <th><a href="/admin/producer/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th scope="col">Id</th>
            <th scope="col">Название</th>
            <th scope="col">Страна</th>
        </tr>
        <#list producers as producer>
            <tr>
                <td>
                    <a href="/admin/producer/${producer.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${producer.id});"><i class="bi bi-trash-fill delete"></i></a>
                    <a href="/admin/producer/delete?producerId=${producer.id}"><i class="bi bi-x delete"></i></a>
                </td>
                <td>${producer.id}</td>
                <td>${producer.producerName}</td>
                <td>${producer.producerCountry}</td>
            </tr>
        </#list>
    </table>

    <script>
        function isDelete(producerId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/producer/" + producerId + "/delete");
            }
        }
    </script>
</@layout.layout>