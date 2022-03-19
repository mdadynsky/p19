<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Categories</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Название</th>

        </tr>
        </thead>
        <tbody>
        <#list categories as category>
            <tr>
                <td>${category.id}</td>
                <td>${category.categoryName}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</@layout.layout>