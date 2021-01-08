# policy-service

# Deploy on Openshift
oc new-app fabric8/s2i-java:latest-java11~https://github.com/acc-trainings/policy-service.git --name=policy-service

oc oc set env dc/policy-service spring.profiles.active=local

# Create Image using build-config using CLI
oc new-build registry.access.redhat.com/ubi8/openjdk-11~https://github.com/acc-trainings/policy-service.git --name=policy-service
# Run the built Image
oc new-app policy-service
