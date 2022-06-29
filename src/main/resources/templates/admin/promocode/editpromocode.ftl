<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование промокодов ${promoCode.promoCodeName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="promoCodeNameInput" class="form-label">Название промокода</label>
                            <input name="promoCodeName" type="text" value="${promoCode.promoCodeName!''}" class="form-control"
                                   id="promoCodeNameInput" placeholder="Введите название промокода">
                        </div>
                        <div class="mb-3">
                            <label for="promoCodeDiscountInput" class="form-label">Общая сумма покупок, от р.</label>
                            <input name="promoCodeDiscount" type="promoCodeDiscount" value="${promoCode.promoCodeDiscount!''}"
                                   class="form-control" id="promoCodeDiscountInput" placeholder="Введите скидку в %">
                        </div>
                        <div class="mb-3">
                            <label for="promoCodeNumbersInput" class="form-label">Промокод.</label>
                            <input name="promoCodeNumbers" type="promoCodeNumbers" value="${promoCode.promoCodeNumbers!''}"
                                   class="form-control" id="promoCodeNumbersInput" placeholder="Введите промокод">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/promocode/promocode">Отмена</a>
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
                    <p>promoCode Help</p>
                </div>

            </div>
        </div>
    </div>





</@layout.layout>