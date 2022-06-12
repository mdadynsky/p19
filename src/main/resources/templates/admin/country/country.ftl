<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Country</h1>
    <table class="table">
        <tr>
            <th><a href="/admin/country/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>#</th>
            <th>CountryName</th>
        </tr>
        <tbody>
        <#list country as country>
            <tr>
                <td>
                    <a href="/admin/country/${country.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${country.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${country.id}</td>
                <td>${country.countryName}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <script>
        function isDelete(countryId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/country/" + countryId + "/delete");
            }
        }
    </script>
</@layout.layout>