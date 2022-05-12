<#import "../theme/public.ftl" as layout/>

<@layout.public>
    <h1>Корзина</h1>

    <#if items?has_content>
        <table class="table">
            <thead>
                <tr>
                    <th>Наименование</th>
                    <th>Возраст</th>
                    <th>Тип</th>
                    <th>Производитель</th>
                    <th>Цена</th>
                </tr>
            </thead>
            <tbody>
            <#list items as item>
                <tr>
                    <td>${item.productName}</td>
                    <td>${item.productAge}</td>
                    <td>${item.productType}</td>
                    <td>${item.producer}</td>
                    <td>${item.productCost}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </#if>
</@layout.public>

