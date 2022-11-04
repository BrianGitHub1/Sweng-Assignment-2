<!DOCTYPE html>
<html>
  <head><title>Calculator App</title>
      <link rel="stylesheet" href="stylesheet.css">
      <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  </head>
  <body>
    <div class="header">Calculator</div>
    <div style="padding-left:10%; padding-right:10%; padding-top:10px">
      <div class="bodyElements">
        <h2>Welcome to Group 28's Online Calculator App!</h2>
        <p>Below you will find an input box where you can enter the expression you would like to calculate.</p>
        <form action="/calc" method="POST" enctype="multipart/form-data">
            <ol>
                <li><label for="sum">Please Insert Expression</label>
                    <input class="w3-input" style="border-bottom: 2px solid #2596be; margin-bottom:5px" type="text" name="sum"><#if sum??>${sum}</#if></textarea>
                    <input style="background-color: #2596be; color: white; border-color:#2596be" type="submit" value="Calculate"
                           name="add">
                </li>
            </ol>
        </form>
        <#if result??>
                    <p>Result: ${result}</p>
                    <p></p>
            <#else>
                <p></p>
        </#if>
      </div>
  </body>
</html>
