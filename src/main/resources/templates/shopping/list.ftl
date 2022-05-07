<#import "../theme/public.ftl" as layout/>

<@layout.public>
    <h1>Корзина</h1>

    <#if items?has_content>
        <ul>
        <#list items as item>
            <li>${item}</li>
        </#list>
        </ul>
    </#if>
</@layout.public>

