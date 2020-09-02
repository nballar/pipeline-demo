FROM tomcat:8-jre8-alpine
#Case sensitive; must put it exactly like above for FROM
RUN rm -rf /usr/local/tomcat/webapps/*
#Cleans the webapps folder
COPY HelloServlets.war /usr/local/tomcat/webapps/HelloServlets.war
#Copy takes the artifact from the file directory where the dockerfile is and places in the tomcat webapps folder
CMD ["catalina.sh", "run"]
#Case sensitive; Will "run catalina.sh" on command line when the container is spun up. This will start tomcat with whatever is in the webapps folder.