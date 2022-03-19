<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Delivery</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Компания</th>

        </tr>
        </thead>
        <tbody>
        <#list delivery as delivery>
            <tr>
                <td>${delivery.id}</td>
                <td>${delivery.companyName}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</@layout.layout>