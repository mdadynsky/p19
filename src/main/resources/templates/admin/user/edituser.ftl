<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <script src="https://unpkg.com/imask"></script>

    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование пользователя ${user.userName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="userNameInput" class="form-label">Имя пользователя</label>
                            <input name="userName" type="text" value="${user.userName!''}" class="form-control" id="userNameInput" placeholder="Введите имя пользователя">
                        </div>
                        <div class="mb-3">
                            <label for="passwordInput" class="form-label">Пароль</label>
                            <input name="password" type="password" value="${user.password!''}" class="form-control" id="passwordInput" placeholder="Введите пароль">
                        </div>
                        <div class="mb-3">
                            <label for="phoneInput" class="form-label">Телефон</label>
                            <input name="phone" type="text" value="${user.phone!''}" class="form-control" id="phoneInput" placeholder="Введите телефон">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary"  type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/user/users">Отмена</a>
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
                    <p>User Help</p>
                </div>

            </div>
        </div>
    </div>

    <script>
        var phoneMask = IMask(
            document.getElementById('phoneInput'), {
                mask: '+{7}(000)000-00-00'
            });
    </script>



</@layout.layout>