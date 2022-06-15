<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>${var1}</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">Название</th>

        </tr>
        </thead>
        <tbody>
         <#list banners as banner>
        <tr>
            <td> ${banner.id}</td>
            <td> ${banner.bannerName}</td>


        </tr>
        </#list>
        </tbody>
    </table>
    </div>

    <script>
        function isDelete(bannerId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/banner/" + bannerId + "/delete");
            }
        }
    </script>

</@layout.layout>