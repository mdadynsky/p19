<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Promo</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Название</th>
            <th scope="col">Описание</th>
            <th scope="col">Цена</th>
        </tr>
        </thead>
        <tbody>
        <#list promos as promo>
            <tr>
                <td>${promo.id}</td>
                <td>${promo.promoName}</td>
                <td>${promo.promoDescription}</td>
                <td>${promo.promoPrice}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</@layout.layout>