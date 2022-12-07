#!/bin/bash

imagename="prometheus-payroll:1.0"
containername="prometheus-payroll"

#################################################################################
# Building image
#################################################################################
docker image build -t ${imagename} .

#################################################################################
# Running container
#################################################################################
docker container run \
  --detach \
  --restart always \
  --network payroll-network \
  --publish 9090:9090 \
  --name ${containername} \
  ${imagename}
