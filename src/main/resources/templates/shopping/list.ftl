<#import "../theme/public.ftl" as layout/>

<@layout.public>
    <h1>Корзина</h1>
    <a href="/shopping/clear.html" class="btn btn-success">Очистить корзину</a>
    <#if items?has_content>
        <table class="table">
            <thead>
                <tr>
                    <th>Наименование</th>
                    <th>Возраст</th>
                    <th>Тип</th>
                    <th>Производитель</th>
                    <th>Цена</th>
                    <th></th>
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
                    <td>
                        <a href="/shopping/clearOne.html?productId=${item.id}">
                            <i class="bi bi-x delete"></i>
                        </a>
                    </td>
                </tr>
            </#list>
            <tr class="shopping-total-row">
                <td colspan="4" ><span class="float-end">Сумма ваших покупок в нашем магазине</span></td>
                <td>${total}</td>
            </tr>
            </tbody>
        </table>

    </#if>
</@layout.public>

