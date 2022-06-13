<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load('current', {
            'packages':['geochart'],
        });
        google.charts.setOnLoadCallback(drawRegionsMap);

        function drawRegionsMap() {
            var data = google.visualization.arrayToDataTable([
                ['Country', 'Popularity'],
                <#list countries as country>
                    ['${country.name}', ${country.count}],
                </#list>
            ]);

            var options = {};

            var chart = new google.visualization.GeoChart(document.getElementById('regions_div'));

            chart.draw(data, options);
        }
    </script>

    <div class="row p-3">
        <div class="col">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Карта</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/report/intervals">График интевалов</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/report/donut">Круговая</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="row">
        <div class="col-9">
            <div id="regions_div"></div>
        </div>
    </div>


</@layout.layout>