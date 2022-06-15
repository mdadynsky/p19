<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>

    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование тега ${tags.tagName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="tagNameInput" class="form-label">Название тега</label>
                            <input name="tagName" type="text" value="${tags.tagName!''}" class="form-control" id="tagNameInput" placeholder="Введите название тега">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary"  type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/tags/tags">Отмена</a>
                        </div>
                        <#if (_csrf.parameterName)??>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </#if>
                    </form>
                </div>
            </div>
        </div>
    </div>

</@layout.layout>
