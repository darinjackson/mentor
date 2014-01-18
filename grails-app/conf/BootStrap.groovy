import com.djackson.WebsiteTemplate

class BootStrap {

    def init = { servletContext ->
        // this is just a test db and test data so make sure not to seed it multiple times. It seems to persist somewhere
        // causing the WebTemplates to be loaded each time the app is deployed.
        if (WebsiteTemplate.count() == 0) {
            System.out.println("Loading Data");
            WebsiteTemplate websiteTemplate = new WebsiteTemplate(thumbnailImage: "7111-m.jpg", largeImage: "7111-b.jpg", templateId: "7111");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7112-m.jpg", largeImage: "7112-b.jpg", templateId: "7112");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7118-m.jpg", largeImage: "7118-b.jpg", templateId: "7118");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7124-m.jpg", largeImage: "7124-b.jpg", templateId: "7124");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7130-m.jpg", largeImage: "7130-b.jpg", templateId: "7130");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7131-m.jpg", largeImage: "7131-b.jpg", templateId: "7131");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7141-m.jpg", largeImage: "7141-b.jpg", templateId: "7141");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7143-m.jpg", largeImage: "7143-b.jpg", templateId: "7143");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7147-m.jpg", largeImage: "7147-b.jpg", templateId: "7147");
            websiteTemplate.save();
            websiteTemplate = new WebsiteTemplate(thumbnailImage: "7150-m.jpg", largeImage: "7150-b.jpg", templateId: "7150");
            websiteTemplate.save();
//        websiteTemplate = new WebsiteTemplate(thumbnailImage: "7152-m.jpg", largeImage: "7152-b.jpg", templateId: "7152");
//        websiteTemplate.save();
//        websiteTemplate = new WebsiteTemplate(thumbnailImage: "7155-m.jpg", largeImage: "7155-b.jpg", templateId: "7155");
//        websiteTemplate.save();
        }
        else {
            System.out.println("NOT Loading Data");
        }
    }
    def destroy = {
    }
}
