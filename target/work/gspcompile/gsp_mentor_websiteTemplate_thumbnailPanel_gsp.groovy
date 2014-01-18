import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mentor_websiteTemplate_thumbnailPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/websiteTemplate/_thumbnailPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
loop:{
int i = 0
for( websiteTemplateInstance in (websiteTemplateInstanceList) ) {
printHtmlPart(0)
createTagBody(2, {->
printHtmlPart(1)
invokeTag('img','g',7,['dir':("images/thumbnails"),'file':(websiteTemplateInstance.thumbnailImage),'width':("145"),'height':("121")],-1)
printHtmlPart(2)
expressionOut.print(websiteTemplateInstance.templateId)
printHtmlPart(3)
})
invokeTag('remoteLink','g',9,['action':("getLargeImageFromId"),'update':("largeImageContainer"),'onSuccess':("return false"),'id':(websiteTemplateInstance.templateId),'title':(websiteTemplateInstance.templateId)],2)
printHtmlPart(4)
i++
}
}
printHtmlPart(5)
invokeTag('set','g',14,['var':("nextIndex"),'value':((params.offset != null) ? Integer.valueOf(params.offset) + 4 : (int) 4)],-1)
printHtmlPart(4)
invokeTag('set','g',17,['var':("prevIndex"),'value':((nextIndex != null) ? Integer.valueOf(nextIndex) - 8 : (int) 0)],-1)
printHtmlPart(6)
if(true && (nextIndex >= websiteTemplateInstanceCount)) {
printHtmlPart(7)
}
else {
printHtmlPart(0)
invokeTag('remoteLink','g',24,['class':("next"),'title':("Next"),'action':("refreshThumbnailPanel"),'update':("thumbnailId"),'max':("4"),'params':([offset: nextIndex])],-1)
printHtmlPart(4)
}
printHtmlPart(4)
if(true && (prevIndex < 0)) {
printHtmlPart(8)
}
else {
printHtmlPart(0)
invokeTag('remoteLink','g',31,['class':("previous"),'title':("Previous"),'action':("refreshThumbnailPanel"),'update':("thumbnailId"),'max':("4"),'params':([offset: prevIndex])],-1)
printHtmlPart(4)
}
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389930724000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
