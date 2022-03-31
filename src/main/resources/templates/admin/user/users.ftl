<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Список пользователей</h1>

    <table class="table">
        <tr>
            <th><a href="/admin/user/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th>Id</th>
            <th>Имя пользователя</th>
        </tr>
        <#list users as user>
            <tr>
                <td>
                    <a href="/admin/user/${user.id}/edit"><i class="bi bi-pencil-fill"></i></a>

                    <a href="#" onclick="isDelete(${user.id});"><i class="bi bi-trash-fill delete"></i></a>

                    <a href="/admin/user/delete?userId=${user.id}"><i class="bi bi-x delete"></i></a>
                </td>
                <td>${user.id}</td>
                <td>${user.userName}</td>
            </tr>
        </#list>
    </table>

    <button class="btn btn-primary" onclick="showAlert()">Alert</button>
    <button class="btn btn-primary" onclick="showPrompt()">Prompt</button>
    <button class="btn btn-primary" onclick="showConfirm()">Confirm</button>
    <script>
        function isDelete(userId) {
            let isConf = confirm("Удалить запись?");
            if (isConf) {
                document.location.replace("/admin/user/"+userId+"/delete");
            }
        }

        function showAlert(){
            alert("Hello");
        }
        function showPrompt(){
            let age = prompt('Сколько тебе лет?', 100);
            alert(age);
        }
        function showConfirm(){
            let isBoss = confirm("Ты здесь главный?");

            alert( isBoss ); // true, если нажата OK
        }
    </script>

</@layout.layout>