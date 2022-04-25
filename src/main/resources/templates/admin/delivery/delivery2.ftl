<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <table class="table" id="producer-table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Company</th>
        </tr>
        </thead>
        <tbody>
        <template data-type="row">
            <tr>
                <td data-field="ID"></td>
                <td data-field="companyName"></td>
            </tr>
        </template>
        </tbody>
    </table>

    <script>
        axios({
            method: 'post',
            url: '/api/admin/delivery/delivery',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function(response) {
            let rowTemplate = document.querySelector('#delivery-table template[data-type="row"]');
            let tableBody = document.querySelector('#delivery-table tbody');

            tableBody.querySelectorAll("tr").forEach(function (e) {
                e.remove();
            })

            if (response.data.length === 0) {
                let notFoundTemplate = document.querySelector('#delivery-table template[data-type="not-found"]');
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