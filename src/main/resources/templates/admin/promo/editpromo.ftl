<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование промо ${promo.promoName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="promoNameInput" class="form-label">Название промо</label>
                            <input name="promoName" type="text" value="${promo.promoName!''}" class="form-control"
                                   id="promoNameInput" placeholder="Введите название промо">
                        </div>
                        <div class="mb-3">
                            <label for="promoDescriptionInput" class="form-label">Описание промо</label>
                            <input name="promoDescription" type="promoDescription" value="${promo.promoDescription!''}"
                                   class="form-control" id="promoDescriptionInput" placeholder="Введите описание">
                        </div>
                        <div class="mb-3">
                            <label for="promoPriceInput" class="form-label">Стоимость промо</label>
                            <input name="promoPrice" type="promoPrice" value="${promo.promoPrice!''}"
                                   class="form-control" id="promoPriceInput" placeholder="Введите стоимость">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/promo/promo">Отмена</a>
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
                    <p>promo Help</p>
                </div>

            </div>
        </div>
    </div>





</@layout.layout>