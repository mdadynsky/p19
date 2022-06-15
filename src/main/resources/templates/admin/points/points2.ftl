<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h2>Points</h2>
    <table id="pointsTable" class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Город</th>
            <th scope="col">Адрес</th>
            <th scope="col">Цена</th>
        </tr>
        </thead>
        <tbody>
        <template>
            <tr>
                <td data-field="id"></td>
                <td data-field="pointsName"></td>
                <td data-field="pointsDescription"></td>
                <td data-field="pointsPrice"></td>
            </tr>
        </template>
        </tbody>
    </table>

    <script>
        axios({
            method: 'post',
            url: '/api/points',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response => {
            let rowTemplate = document.querySelector('#user-table template[data-type="row"]');
            let tableBody = document.querySelector('#user-table tbody');

            tableBody.querySelectorAll("tr").forEach(e => e.remove())

            if (response.data.length === 0) {
                let notFoundTemplate = document.querySelector('#user-table template[data-type="not-found"]');
                let row = notFoundTemplate.content.cloneNode(true)
                tableBody.appendChild(row);
            } else {
                response.data.forEach(data => {
                    let row = rowTemplate.content.cloneNode(true);
                    {
                        Object.keys(data).map((fieldName) => {
                            let cell = row.querySelector("[data-field='" + fieldName + "']");
                            if (cell != null)
                                cell.textContent = data[fieldName];
                        })
                    }
                    tableBody.appendChild(row);
                });
            }
        })
    </script>

</@layout.layout>