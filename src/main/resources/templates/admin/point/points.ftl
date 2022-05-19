<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">Город</th>
            <th scope="col">Адрес доставки</th>

        </tr>
        </thead>
        <tbody>
        <div class="container-fluid">
            <tr>
                <th scope="row">Торгаш</th>
                <td>Новокузнецк</td>
            </tr>
            <tr>
                <th scope="row">Принимайка</th>
                <td>Кемерово</td>
            </tr>
            <tr>
                <th scope="row">Отдавайка</th>
                <td>Томск</td>
            </tr>
            <tr>
                <th scope="row">Волшебный</th>
                <td>Таштагол</td>
            </tr>
            <tr>
                <th scope="row">Рядом</th>
                <td>Москва</td>
            </tr>
        </div>
        </tbody>
    </table>
    <h1>Филиалы</h1>
</@layout.layout>