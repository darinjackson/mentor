<%@ page import="com.djackson.WebsiteTemplate" %>



<div class="fieldcontain ${hasErrors(bean: websiteTemplateInstance, field: 'largeImage', 'error')} ">
	<label for="largeImage">
		<g:message code="websiteTemplate.largeImage.label" default="Large Image" />
		
	</label>
	<g:textField name="largeImage" value="${websiteTemplateInstance?.largeImage}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: websiteTemplateInstance, field: 'templateId', 'error')} ">
	<label for="templateId">
		<g:message code="websiteTemplate.templateId.label" default="Template Id" />
		
	</label>
	<g:textField name="templateId" value="${websiteTemplateInstance?.templateId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: websiteTemplateInstance, field: 'thumbnailImage', 'error')} ">
	<label for="thumbnailImage">
		<g:message code="websiteTemplate.thumbnailImage.label" default="Thumbnail Image" />
		
	</label>
	<g:textField name="thumbnailImage" value="${websiteTemplateInstance?.thumbnailImage}"/>
</div>

