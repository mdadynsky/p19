<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Список производителей (ajax)</h1>

    <table class="table" id="producer-table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Название</th>
            <th scope="col">Страна</th>
        </tr>
        </thead>
        <tbody>
        <template data-type="row">
            <tr>
                <td data-field="id"></td>
                <td data-field="producerName"></td>
                <td data-field="producerCountry"></td>
            </tr>
        </template>
        </tbody>
    </table>

    <script>
        axios({
            method: 'post',
            url: '/api/admin/producer/producers',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function(response) {
            let rowTemplate = document.querySelector('#producer-table template[data-type="row"]');
            let tableBody = document.querySelector('#producer-table tbody');

            tableBody.querySelectorAll("tr").forEach(function (e) {
                e.remove();
            })

            if (response.data.length === 0) {
                let notFoundTemplate = document.querySelector('#producer-table template[data-type="not-found"]');
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