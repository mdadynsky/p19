<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h2>Ajax User List</h2>
    <table class="table" id="user-table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Имя пользователя</th>
        </tr>
        </thead>
        <tbody>
        <template data-type="row">
            <tr>
                <td data-field="id"></td>
                <td data-field="userName"></td>
            </tr>
        </template>
        </tbody>
    </table>

    <script>
        axios({
            method: 'post',
            url: '/api/admin/user/users',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function (response) {
            let rowTemplate = document.querySelector('#user-table template[data-type="row"]');
            let tableBody = document.querySelector('#user-table tbody');

            tableBody.querySelectorAll("tr").forEach(function (e) {
                e.remove()
            })

            if (response.data.length === 0) {
                let notFoundTemplate = document.querySelector('#user-table template[data-type="not-found"]');
                let row = notFoundTemplate.content.cloneNode(true)
                tableBody.appendChild(row);
            } else {
                response.data.map(function (data) {
                    let row = rowTemplate.content.cloneNode(true);
                    {
                        Object.keys(data).map((fieldName, i) => {
                            let cell = row.querySelector("[data-field='" + fieldName + "']");
                            if (cell != null)
                                cell.textContent = data[fieldName];
                        })
                    }
                    tableBody.appendChild(row);
                }).join('');
            }
        }).catch(function (err) {

        });
    </script>
</@layout.layout>