<#import "/spring.ftl" as spring/>
<#import "theme/layout.ftl" as layout/>

<@layout.layout>
    Форма логина
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <div class="card">
                <div class="card-body">
                    <div class="alert alert-info">
                        username: admin, password : admin
                    </div>
                    <form action="/perform-login.html" method="post">
                        <div class="mb-3">
                            <label for="userNameInput" class="form-label">Имя пользователя</label>
                            <input name="user" type="text" class="form-control" id="userNameInput" placeholder="Введите имя пользователя">
                        </div>
                        <div class="mb-3">
                            <label for="passNameInput" class="form-label">Пароль</label>
                            <input name="pass" type="password" class="form-control" id="passNameInput" placeholder="Введите пароль">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary"  type="submit" value="Войти">
                        </div>
                        <#if (_csrf.parameterName)??>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </#if>
                    </form>
                </div>
            </div>

        </div>
        <div class="col-3"></div>
    </div>

</@layout.layout>