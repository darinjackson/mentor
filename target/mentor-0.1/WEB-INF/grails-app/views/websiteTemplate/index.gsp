<%@ page import="com.djackson.WebsiteTemplate" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'websiteTemplate.label', default: 'DJackson Project')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<div id="container">
    <header>
        Code Development Project
    </header>

    <div id="main" role="main">
        %{-- style it centered --}%
        <div id="large" style="margin-left: auto;margin-right: auto;width: 430px">
            <div id="largeImageContainer" class="group">
                <g:img dir="images/large" file="${websiteTemplateInstanceList[0].largeImage}"
                       width="430"
                       height="360"/>
            </div>
        </div>

        <div class="thumbnails">
            <div id="thumbnailId" class="group">
                <g:render template="thumbnailPanel"
                          model="[websiteTemplateInstanceList: websiteTemplateInstanceList,
                                  websiteTemplateInstanceCount: websiteTemplateInstanceCount, params: params]"/>
            </div>
        </div>

        <div style="clear:both"></div>

        %{--<div class="pagination">--}%
            %{--<g:paginate max="4" total="${websiteTemplateInstanceCount ?: 0}"/>--}%
        %{--</div>--}%
    </div>
</div>
</body>
</html>
