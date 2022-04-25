<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование компаний по доставке ${delivery.companyName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="deliveryNameInput" class="form-label">Название компании</label>
                            <input name="deliveryName" type="text" value="${delivery.companyName!''}" class="form-control"
                                   id="deliveryNameInput" placeholder="Введите название компании">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/delivery/delivery">Отмена</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card">
                <div class="card-body">
                    <p>delivery Help</p>
                </div>

            </div>
        </div>
    </div>
</@layout.layout>