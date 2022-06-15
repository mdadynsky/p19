<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <div class="row">
        <div class="col">
            <h1 id="title">Редактирование городов ${city.cityName!''}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div class="card">
                <div class="card-body">
                    <form action="" method="post">
                        <div class="mb-3">
                            <label for="cityNameInput" class="form-label">Название города</label>
                            <input name="cityName" type="text" value="${city.cityName!''}" class="form-control"
                                   id="cityNameInput" placeholder="Введите название города">
                        </div>
                        <div class="mb-3">
                            <label for="cityRegionInput" class="form-label">Область</label>
                            <input name="cityRegion" type="cityRegion" value="${city.cityRegion!''}"
                                   class="form-control" id="cityRegionInput" placeholder="Введите название области">
                        </div>
                        <div class="mb-3">
                            <label for="cityWarehousesInput" class="form-label">Количество складов</label>
                            <input name="cityWarehouses" type="cityWarehouses" value="${city.cityWarehouses!''}"
                                   class="form-control" id="cityWarehousesInput"
                                   placeholder="Введите количество складов">
                        </div>
                        <div class="mb-3">
                            <input class="btn btn-primary" type="submit" value="Сохранить">
                            <a class="btn btn-info" href="/admin/city/city">Отмена</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card">
                <div class="card-body">
                    <p>city Help</p>
                </div>

            </div>
        </div>
    </div>





</@layout.layout>