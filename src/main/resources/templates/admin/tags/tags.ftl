<#import "/spring.ftl" as spring/>
<#import "../../theme/layout.ftl" as layout/>

<@layout.layout>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <h1>Теги</h1>
    <table class="table">
        <thead>
        <tr>
            <th><a href="/admin/tags/create"><i class="bi bi-plus-square-fill"></i></a></th>
            <th scope="col">ID</th>
            <th scope="col">Тег</th>
        </tr>
        </thead>
        <tbody>
        <#list tags as tag>
            <tr>
                <td>
                    <a href="/admin/tags/${tag.id}/edit"><i class="bi bi-pencil-fill"></i></a>
                    <a href="#" onclick="isDelete(${tag.id});"><i class="bi bi-trash-fill delete"></i></a>
                </td>
                <td>${tag.id}</td>
                <td>${tag.tagName}</td>
            </tr>
        </#list>
        </tbody>
    </table>
    <script>
        function isDelete(tagId) {
            Swal.fire({
                title: 'Удалить запись?',
                showDenyButton: true,
                showCancelButton: false,
                confirmButtonText: 'Удалить',
                denyButtonColor: '#ac111f',
                denyButtonText: 'Не удалять'
            }).then((result) => {
                if (result.isConfirmed) {
                    Swal.fire('Удаляем!', '', 'success').then((result) => {
                        document.location.replace("/admin/tags/"+tagId+"/delete");
                    });
                } else if (result.isDenied) {
                    Swal.fire('Удаление прервано', '', 'info')
                }
            })
        }
    </script>
</@layout.layout>