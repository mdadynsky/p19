<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
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
                            <input class="btn btn-primary"  type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/user/users">Отмена</a>
                        </div>
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





</@layout.layout>