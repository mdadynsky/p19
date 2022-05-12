<#import "/spring.ftl" as spring/>
<#import "theme/public.ftl" as layout/>
<#import "shopping/product.ftl" as productCard/>

<@layout.public>
    <@productCard.script/>
    <div class="row gy-3">
        <#list products as product>
            <div class="col">
                <@productCard.item product.productName product.productCost product.productAge product.producer/>
            </div>
        </#list>
    </div>
    <div class="row">

    </div>
    <div class="row">

    </div>

</@layout.public>