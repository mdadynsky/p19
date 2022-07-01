<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование подарочных карт ${gift.giftName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="giftNameInput" class="form-label">Скидки</label>
                            <input name="giftName" type="text" value="${gift.giftName!''}" class="form-control"
                                   id="giftNameInput" placeholder="Введите название подарочной карты">
                        </div>
                        <div class="mb-3">
                            <label for="giftDescriptionInput" class="form-label">Описание карты</label>
                            <input name="giftDescription" type="giftDescription" value="${gift.giftDescription!''}"
                                   class="form-control" id="giftDescriptionInput" placeholder="Введите описание">
                        </div>
                        <div class="mb-3">
                            <label for="giftPriceInput" class="form-label">Размер скидки</label>
                            <input name="giftPrice" type="giftPrice" value="${gift.giftPrice!''}"
                                   class="form-control" id="giftPriceInput" placeholder="Введите уровень подарочной карты">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/gift/gift">Отмена</a>
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
                    <p>gift Help</p>
                </div>

            </div>
        </div>
    </div>



.

</@layout.layout>