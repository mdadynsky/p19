<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h2>PromoCode</h2>
    <table id="promoCodeTable" class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Название промокода</th>
            <th scope="col">Скидка, %</th>
            <th scope="col">Промокод</th>
        </tr>
        </thead>
        <tbody>
        <template>
            <tr>
                <td data-field="id"></td>
                <td data-field="promoCodeName"></td>
                <td data-field="promoCodeDiscount"></td>
                <td data-field="promoCodeNumbers"></td>
            </tr>
        </template>
        </tbody>
    </table>

    <script>
        axios({
            method: 'post',
            url: '/api/promocode',
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