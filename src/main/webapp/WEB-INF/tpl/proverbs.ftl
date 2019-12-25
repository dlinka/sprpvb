<h1>我是一个列表页,可以看到你想要看到的列表</h1>

<#list proverbList.list as proverb>
<a href="/proverb/${proverb.proverbId}">
    <span>${proverb.content}</span><a href="/proverb/like/${proverb.proverbId}"></a>
    <span class="like" proverbId="${proverb.proverbId}" style="color: #ff0000">点赞:${proverb.star}</span>
</a><br/>
</#list>
<#if proverbList.hasPreviousPage><a href="/proverb/list?pageSize=3&pageNum=${proverbList.prePage}">上一页</a></#if>
<#if proverbList.hasNextPage><a href="/proverb/list?pageSize=3&pageNum=${proverbList.nextPage}">下一页</a></#if>

<script type="text/javascript" src="${request.contextPath}/static/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".like").click(function () {
            var proverbId = $(this).attr("proverbId");
            $.ajax({
                url: "/proverb/like/" + proverbId,
                method: "PUT"
            }).done(function (msg) {
                window.location.reload();
            });
        });
    });
</script>