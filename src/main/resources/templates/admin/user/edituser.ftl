<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
<h1 id="title">Edit user</h1>


<script>
    //alert("Hello 1!")
    //alert("Hello 2!")
    let h1 = document.querySelector("#title")
    console.log(h1)
    console.log("Hello 3")

    axios({
            method: 'get',
            url: '/api/admin/user/users333',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function (response) {
            console.log("Ok")
        }).catch(function (err) {
            console.log("Error")
    })


</script>

</@layout.layout>