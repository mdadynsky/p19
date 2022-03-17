<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Название</th>

        </tr>
        </thead>
        <tbody>
        <div class="container-fluid">
        <tr>
            <th scope="row">1</th>
            <td>Для мужчин</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>Для женщин</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>Для детей</td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td>Акции</td>
        </tr>
            </div>
        </tbody>
    </table>
    <h1>Categories</h1>
</@layout.layout>