1. To deploy the app, copy the war file from
https://github.com/darinjackson/mentor/target/mentor-0.1.war to the
proper location for your Servlet Container. For Tomcat 6 and 7 copy the
war file to the $CATALINA_HOME/webapps directory. The project is configured to run with 
Servlet Spec 2.5 which should keep it compatible with other containers.

2. Once Tomcat is running, the url will be 
http://your host:your port/mentor-0.1 unless you renamed the war file. E.g.

http://localhost:8080/mentor

3. The app works pretty much as specified. The only deficiency is that the thumbnail
does not appear with a selected background once it has been selected. I suspect there
is a loss of focus after the AJAX call but I did not track down the problem.


Please note that this app uses Grails and is a fully defined CRUD app running an H2
database. That's why it is such a big deployment. I didn't try to pare it down.

The Model is in mentor/grails-app/domain/com/djackson/WebsiteTemplate.groovy

The Controller is in mentor/grails-app/controllers/com/djackson/WebsiteTemplateController.groovy

The Views are in mentor/grails-app/views
	- Grails Templates in _largeImage.gsp and thumbnailPanel.gsp
	- main file in index.gsp