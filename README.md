# policy-service

# Deploy on Openshift
oc new-app fabric8/s2i-java:latest-java11~https://github.com/acc-trainings/policy-service.git --name=policy-service
oc oc set env dc/policy-service spring.profiles.active=local
