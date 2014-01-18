<g:each in="${websiteTemplateInstanceList}" status="i" var="websiteTemplateInstance">
    <g:remoteLink action="getLargeImageFromId" update="largeImageContainer"
                onSuccess="return false"
                  id="${websiteTemplateInstance.templateId}"
                  title="${websiteTemplateInstance.templateId}">
        <g:img dir="images/thumbnails" file="${websiteTemplateInstance.thumbnailImage}" width="145"
               height="121"/>
        <span>${websiteTemplateInstance.templateId}</span>
    </g:remoteLink>
</g:each>
<span class="previous disabled" title="Previous">Previous</span>
<g:set var="nextIndex" value="${
    (params.offset != null) ? Integer.valueOf(params.offset) + 4 : (int) 4
}"/>
<g:set var="prevIndex" value="${
    (nextIndex != null) ? Integer.valueOf(nextIndex) - 8 : (int) 0
}"/>

<g:if test="${nextIndex >= websiteTemplateInstanceCount}">
    <span class="next disabled" title="Next"></span>
</g:if>
<g:else>
    <g:remoteLink class="next" title="Next" action="refreshThumbnailPanel" update="thumbnailId" max="4"
                  params="[offset: nextIndex]"/>
</g:else>
<g:if test="${prevIndex < 0}">
    <span class="previous disabled" title="Previous"></span>
</g:if>
<g:else>
    <g:remoteLink class="previous" title="Previous" action="refreshThumbnailPanel" update="thumbnailId" max="4"
                  params="[offset: prevIndex]"/>
</g:else>
