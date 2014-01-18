package com.djackson

import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.*

@Transactional(readOnly = true)
class WebsiteTemplateController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    // default controller action
    def index(Integer max) {
        params.max = Math.min(max ?: 4, 100)
        System.out.println("params.offset = " + params.offset);
        respond WebsiteTemplate.list(params), model: [websiteTemplateInstanceCount: WebsiteTemplate.count()]
    }

    def refreshThumbnailPanel(Integer max) {
        params.max = Math.min(max ?: 4, 100)
        System.out.println("params.offset = " + params.offset);
        def instances = WebsiteTemplate.list(params)
        render(template: "thumbnailPanel", model: [websiteTemplateInstanceList: instances, websiteTemplateInstanceCount: WebsiteTemplate.count()])
    }

    def show(WebsiteTemplate websiteTemplateInstance) {
        respond websiteTemplateInstance
    }

    def create() {
        respond new WebsiteTemplate(params)
    }

    @Transactional
    def save(WebsiteTemplate websiteTemplateInstance) {
        if (websiteTemplateInstance == null) {
            notFound()
            return
        }

        if (websiteTemplateInstance.hasErrors()) {
            respond websiteTemplateInstance.errors, view: 'create'
            return
        }

        websiteTemplateInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'websiteTemplateInstance.label', default: 'WebsiteTemplate'), websiteTemplateInstance.id])
                redirect websiteTemplateInstance
            }
            '*' { respond websiteTemplateInstance, [status: CREATED] }
        }
    }

    def edit(WebsiteTemplate websiteTemplateInstance) {
        respond websiteTemplateInstance
    }

    @Transactional
    def update(WebsiteTemplate websiteTemplateInstance) {
        if (websiteTemplateInstance == null) {
            notFound()
            return
        }

        if (websiteTemplateInstance.hasErrors()) {
            respond websiteTemplateInstance.errors, view: 'edit'
            return
        }

        websiteTemplateInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'WebsiteTemplate.label', default: 'WebsiteTemplate'), websiteTemplateInstance.id])
                redirect websiteTemplateInstance
            }
            '*' { respond websiteTemplateInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(WebsiteTemplate websiteTemplateInstance) {

        if (websiteTemplateInstance == null) {
            notFound()
            return
        }

        websiteTemplateInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'WebsiteTemplate.label', default: 'WebsiteTemplate'), websiteTemplateInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'websiteTemplateInstance.label', default: 'WebsiteTemplate'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }

    def getLargeImageFromId() {
        def templateId = params.id;
        def template = WebsiteTemplate.findByTemplateId(templateId);
        // get the largeImage template from the WebsiteTemplate for the render the WebsiteTemplate with the templateId
        render(template: 'largeImage', model: [selectedWebsiteTemplate: template]);

    }
}
