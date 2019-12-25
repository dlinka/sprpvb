<h1>我是一个首页,我有列表页和登录页链接</h1>
<a href="/proverb/list">查看今日谚语</a>
<#if user??>
${user.username}
<#else>
<a href="/login">登录</a>
</#if>