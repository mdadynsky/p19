<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>User list</h1>

    <table class="table">
        <tr>
            <th>Id</th>
            <th>Имя пользователя</th>
        </tr>
        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
            </tr>
        </#list>
    </table>

</@layout.layout>