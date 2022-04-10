<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h2>Promo</h2>
    <table id="promoTable" class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Название</th>
            <th scope="col">Описание</th>
            <th scope="col">Цена</th>
        </tr>
        </thead>
        <tbody>
        <template>
            <tr>
                <td data-field="id"></td>
                <td data-field="promoName"></td>
                <td data-field="promoDescription"></td>
                <td data-field="promoPrice"></td>
            </tr>
        </template>
        </tbody>
    </table>

    <script>
        axios({
            method: 'post',
            url: '/api/promo',
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