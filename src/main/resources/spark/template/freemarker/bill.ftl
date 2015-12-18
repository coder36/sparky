<#import "page.ftl" as u>
<#assign bill = data?eval>

<@u.page>

    <h1>Your sky Bill</h1>
    <hr/>
    <h4><@u.nice_date bill.statement.period.from/> - <@u.nice_date bill.statement.period.to/></h4>

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">My Subscriptions</h3>
        </div>
        <div class="panel-body">

            <#list bill.package.subscriptions as sub>
            <div class="row">
                <div class="col-xs-8">${sub.name} (${sub.type})</div>
                <div class="col-xs-4">${h.niceAmount(sub.cost)}</div>
            </div>
            <hr/>
            </#list>

        </div>
    </div>
</@u.page>
