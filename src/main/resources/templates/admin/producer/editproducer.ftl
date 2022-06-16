<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование производителя ${producer.producerName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="producerNameInput" class="form-label">Название производителя</label>
                            <input name="producerName" type="text" value="${producer.producerName!''}" class="form-control" id="producerNameInput" placeholder="Введите название производителя">
                        </div>
                        <div class="mb-3">
                            <label for="producerCountryInput" class="form-label">Страна производителя</label>
                            <input name="producerCountry" type="text" value="${producer.producerCountry!''}" class="form-control" id="producerCountryInput" placeholder="Введите страну производителя">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/producer/producers">Отмена</a>
                        </div>
                        <#if (_csrf.parameterName)??>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </#if>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card">
                <div calss="card-body">
                    <p>Producer Help</p>
                </div>
            </div>
        </div>
    </div>

</@layout.layout>