<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <h1>Promo</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Название</th>
            <th scope="col">Описание</th>
            <th scope="col">Цена</th>
        </tr>
        </thead>
        <tbody>
        <#list promos as promo>
            <tr>
                <td>${promo.id}</td>
                <td>${promo.promoName}</td>
                <td>${promo.promoDescription}</td>
                <td>${promo.promoPrice}</td>
            </tr>
        </#list>
        </tbody>
    </table>

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
            url: '/api/promo',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function (response) {
            console.log("ajax-запрос получен")
            let tableBody = document.querySelector('#promoTable tbody');
            console.log(tableBody)
            let template = tableBody.querySelector("template")
            console.log(template)
            response.data.forEach(data => {
                console.log("*")
                console.log(data)
                let row = template.content.cloneNode(true)
                let cellId = row.querySelector('[data-field="id"]')
                let cellpromoName = row.querySelector('[data-field="promoName"]')
                let cellpromoDescription = row.querySelector('[data-field="promoDescription"]')
                let cellpromoPrice = row.querySelector('[data-field="promoPrice"]')
                cellId.textContent = data.id
                cellpromoName.textContent = data.promoName
                cellpromoDescription.textContent = data.promoDescription
                cellpromoPrice.textContent = data.promoPrice
                tableBody.appendChild(row)
            })
        })
    </script>
</@layout.layout>