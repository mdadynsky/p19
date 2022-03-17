<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Компания</th>

        </tr>
        </thead>
        <tbody>
        <div class="container-fluid">
            <tr>
                <th scope="row">1</th>
                <td>Почта России</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>ПЭК</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>DHL</td>
            </tr>
            <tr>
                <th scope="row">4</th>
                <td>СДЭК</td>
            </tr>
            <tr>
                <th scope="row">5</th>
                <td>Boxberry</td>
            </tr>
        </div>
        </tbody>
    </table>
    <h1>Доставка</h1>
</@layout.layout>