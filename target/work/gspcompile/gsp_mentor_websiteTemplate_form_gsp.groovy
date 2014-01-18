import com.djackson.WebsiteTemplate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mentor_websiteTemplate_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/websiteTemplate/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: websiteTemplateInstance, field: 'largeImage', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("websiteTemplate.largeImage.label"),'default':("Large Image")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("largeImage"),'value':(websiteTemplateInstance?.largeImage)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: websiteTemplateInstance, field: 'templateId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("websiteTemplate.templateId.label"),'default':("Template Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("templateId"),'value':(websiteTemplateInstance?.templateId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: websiteTemplateInstance, field: 'thumbnailImage', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("websiteTemplate.thumbnailImage.label"),'default':("Thumbnail Image")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("thumbnailImage"),'value':(websiteTemplateInstance?.thumbnailImage)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389670896000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
