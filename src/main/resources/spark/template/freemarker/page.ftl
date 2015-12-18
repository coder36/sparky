<#macro page>
    <html>
        <head>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.css">
        </head>
        <body>
            <div class="container">
                <#nested>
            </div
        </body>
    </html>
</#macro>

<#macro nice_date d>${h.niceDate(d)}</#macro>



