<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="container">
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
            <tr>
                <th scope="row">1</th>
                <td>Кубик Рубика</td>
                <td>Классическая головоломка, которую можно решить дома или в дороге.</td>
                <td>450.00 руб.</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Настольная игра "Штука"</td>
                <td>Объясни. Найди. Схвати!</td>
                <td>1699.00 руб.</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>Игрушка антистресс</td>
                <td>Мягкая игрушка, которую можно сжимать, растягивать и подбрасывать.</td>
                <td>240.00 руб.</td>
            </tr>
            </tbody>
        </table>
    </div>
</@layout.layout>