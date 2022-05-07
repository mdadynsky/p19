<#import "/spring.ftl" as spring/>
<#import "theme/public.ftl" as layout/>
<#import "shopping/product.ftl" as product/>

<@layout.public>
    <@product.script/>
    <div class="row gy-3">
        <div class="col">
            <@product.item/>
        </div>

        <div class="col">
            <@product.item/>
        </div>

        <div class="col">
            <@product.item/>
        </div>

        <div class="col">
            <div class="card" style="width: 18rem;">
                <img src="https://cdn1.ozone.ru/s3/multimedia-v/6060630475.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>
    </div>
    <div class="row gy-3">
        <div class="col">
            <div class="card" style="width: 18rem;">
                <img src="https://cdn1.ozone.ru/s3/multimedia-v/6060630475.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

        <div class="col">
            <div class="card" style="width: 18rem;">
                <img src="https://cdn1.ozone.ru/s3/multimedia-v/6060630475.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

        <div class="col">
            <div class="card" style="width: 18rem;">
                <img src="https://cdn1.ozone.ru/s3/multimedia-v/6060630475.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

        <div class="col">
            <div class="card" style="width: 18rem;">
                <img src="https://cdn1.ozone.ru/s3/multimedia-v/6060630475.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>
    </div>
    <div class="row">

    </div>
    <div class="row">

    </div>

</@layout.public>