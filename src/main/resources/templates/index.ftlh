<!DOCTYPE html>
<html>
<head><title></title>
    <link rel="stylesheet" href="tachyons.min.css">
</head>
<body class="ph3 pt0 pb4 mw7 center sans-serif">
<h1 class="f2 mb0"><span class="gold">i</span>Calc</h1>
<p class="f5 mt1 mb4 lh-copy">A simple calculator web app</p>
<form action="/calc" method="POST" enctype="multipart/form-data">
    <ol class="list pl0">
        <li class="mv3"><label class="f6 b db mb2" for="description">Insert Expression</label>
            <textarea class="f4 db border-box hover-black w-100 measure ba b--black-20 pa2 br2 mb2" rows="1"
                      name="sum"><#if sum??>${sum}</#if></textarea>
            <input class="f6 link dim br1 ba bw1 ph3 pv2 mb2 dib black bg-white pointer" type="submit" value="Calculate"
                   name="add">
        </li>
    </ol>
</form>
<ul class="list pl0"><p class="f6 b db mb2">Equations</p>
    <#if result??>
                <p>${result}</p>
                <p></p>
        <#else>
            <p class="lh-copy f6">No previous calculations</p>
        </#list>
    </#if>
</ul>
</body>
</html>
