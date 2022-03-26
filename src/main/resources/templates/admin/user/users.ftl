<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Список пользователей</h1>

    <table class="table">
        <tr>
            <th></th>
            <th>Id</th>
            <th>Имя пользователя</th>
        </tr>
        <#list users as user>
            <tr>
                <td>
                    <a href="/admin/user/delete?userId=${user.id}">
                        <i class="bi bi-x delete"></i>
                    </a>
                </td>
                <td>${user.id}</td>
                <td>${user.userName}</td>
            </tr>
        </#list>
    </table>

</@layout.layout>