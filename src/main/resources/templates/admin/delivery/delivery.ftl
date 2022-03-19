<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Delivery</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Company</th>
        </tr>
        </thead>
        <tbody>
        <#list delivery as delivery>
            <tr>
                <td>${delivery.id}</td>
                <td>${delivery.companyName}</td>
            </tr>
        </#list>
        </tbody>
    </table>


    <h2>Delivery</h2>
    <table class="table" id="delivery-table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Company</th>
        </tr>
        </thead>
        <tbody>
        <template data-type="row">
            <tr>
                <td data-field="id"></td>
                <td data-field="companyName"></td>
                <td data-field="companyName"></td>
            </tr>
        </template>
        </tbody>
    </table>
    <script>
        axios({
            url: '/api/admin/delivery/delivery',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function (response) {
            console.log("ajax-запрос получен")
            let tableBody = document.querySelector('#delivery-table tbody');
            console.log(tableBody);
            let template = tableBody.querySelector("template");
            console.log(template);
            response.data.forEach(data => {
                console.log("*")
                console.log(data)
                let row = template.content.cloneNode(true)
                let cellId = row.querySelector('[data-field="id"]')
                let cellCompanyName = row.querySelector('[data-field="companyName"]')
                cellId.textContent = data.id
                cellCompanyName.textContent = data.companyName
                tableBody.appendChild(row)
            })
        })
    </script>

</@layout.layout>