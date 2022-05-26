<#macro item productId name cost age producer>
    <div class="card" style="width: 18rem;">
        <img src="https://cdn1.ozone.ru/s3/multimedia-v/6060630475.jpg" class="card-img-top pt-3" alt="...">
        <div class="card-body">
            <div class="row">
                <div class="col-9"><h4 class="text-danger">${cost}</h4></div>
                <div class="col-3">
                    <span class="badge bg-secondary">${age}</span>
                </div>
            </div>
            <div class="row">
                <div class="col rating-star">
                    <#list 1..5 as x>
                        <i onclick="rating(${productId},${x})" class="bi bi-star"></i>
                    </#list>
                </div>
            </div>
            <h5 class="card-title" id="product-title-${productId}">${name}</h5>
            <p class="card-text">${producer}</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
            <a href="#" class="btn btn-success addToCard" id="${productId}">В корзину</a>
        </div>
    </div>
</#macro>

<#macro script>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script>
        document.addEventListener('DOMContentLoaded', function(){
            let buttons = document.querySelectorAll(".addToCard");
            buttons.forEach(function(btn) {
                btn.onclick = addToCard;
            });
        });

        function addToCard() {
            let id = this.id;
            axios({
                method: 'get',
                url: '/shopping/add.html?productId='+id,
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(function (response) {
                let shoppingCardCount = document.querySelector("#shoppingCardCount");
                shoppingCardCount.innerHTML=response.data.count;
                let title = document.querySelector("#product-title-"+id).innerText;
                Swal.fire(
                    'Товар добавлен в корзину',
                    title,
                    'success'
                )
            });
        }

        function rating(id, rt) {
            axios({
                method: 'get',
                url: '/shopping/rating.html?productId='+id+'&rating='+rt,
                headers: {
                    'Content-Type': 'application/json'
                }
            });
        }
    </script>
</#macro>