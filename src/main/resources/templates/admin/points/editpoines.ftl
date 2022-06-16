<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование цены ${points.pointsName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="pointsNameInput" class="form-label">Скидки</label>
                            <input name="pointsName" type="text" value="${points.pointsName!''}" class="form-control"
                                   id="pointsNameInput" placeholder="Введите город">
                        </div>
                        <div class="mb-3">
                            <label for="pointsDescriptionInput" class="form-label">Описание скидки</label>
                            <input name="pointsDescription" type="pointsDescription" value="${points.pointsDescription!''}"
                                   class="form-control" id="pointsDescriptionInput" placeholder="Введите адрес">
                        </div>
                        <div class="mb-3">
                            <label for="pointsPriceInput" class="form-label">Размер скидки</label>
                            <input name="pointsPrice" type="pointsPrice" value="${points.pointsPrice!''}"
                                   class="form-control" id="pointsPriceInput" placeholder="Введите цену">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/points/points">Отмена</a>
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
                <div class="card-body">
                    <p>points Help</p>
                </div>

            </div>
        </div>
    </div>





</@layout.layout>