<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Product</h1>

    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Название</th>
            <th scope="col">Тип</th>
            <th scope="col">Рекомендуемый возраст</th>
            <th scope="col">Цена</th>
        </tr>
        </thead>
        <tbody>
        <#list products as product>
        <tr>
            <td>
                <a href="/admin/product/${product.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                <a href="/" onclick="isDelete(${product.id});"><i class="bi bi-trash-fill delete"></i></a>
            </td>
            <td>${product.id}</td>
            <td>${product.productName}</td>
            <td>${product.productType}</td>
            <td>${product.productAge}</td>
            <td>${product.productCost}</td>


        </tr>
        </#list>
        </tbody>
    </table>
        <script>
            function isDelete(productId) {
                let isConf = confirm("Удалить запись?");
                if (isConf) {
                    document.location.replace("/admin/product/" + productId + "/delete");
                }
            }
        </script>

</@layout.layout>