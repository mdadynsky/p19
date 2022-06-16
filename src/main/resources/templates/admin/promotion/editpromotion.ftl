<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование скидок ${promotion.promotionName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="promotionNameInput" class="form-label">Скидки</label>
                            <input name="promotionName" type="text" value="${promotion.promotionName!''}" class="form-control"
                                   id="promotionNameInput" placeholder="Введите название скидки">
                        </div>
                        <div class="mb-3">
                            <label for="promotionDescriptionInput" class="form-label">Описание скидки</label>
                            <input name="promotionDescription" type="promotionDescription" value="${promotion.promotionDescription!''}"
                                   class="form-control" id="promotionDescriptionInput" placeholder="Введите описание">
                        </div>
                        <div class="mb-3">
                            <label for="promotionPriceInput" class="form-label">Размер скидки</label>
                            <input name="promotionPrice" type="promotionPrice" value="${promotion.promotionPrice!''}"
                                   class="form-control" id="promotionPriceInput" placeholder="Введите размер скидки">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/promotion/promotion">Отмена</a>
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
                    <p>promotion Help</p>
                </div>

            </div>
        </div>
    </div>





</@layout.layout>