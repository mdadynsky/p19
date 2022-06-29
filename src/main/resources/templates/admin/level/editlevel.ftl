<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование уровней покупателей ${level.levelName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="levelNameInput" class="form-label">Название уровня покупателя</label>
                            <input name="levelName" type="text" value="${level.levelName!''}" class="form-control"
                                   id="levelNameInput" placeholder="Введите название уровня">
                        </div>
                        <div class="mb-3">
                            <label for="levelTotalAmountOfPurchasesInput" class="form-label">Общая сумма покупок, от р.</label>
                            <input name="levelTotalAmountOfPurchases" type="levelTotalAmountOfPurchases" value="${level.levelTotalAmountOfPurchases!''}"
                                   class="form-control" id="levelTotalAmountOfPurchasesInput" placeholder="Введите сумму покупок">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/level/level">Отмена</a>
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
                    <p>level Help</p>
                </div>

            </div>
        </div>
    </div>





</@layout.layout>