#!/bin/bash

imagename="blackbox-payroll:1.0"
containername="blackbox-payroll"

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
  --publish 9115:9115 \
  --name ${containername} \
  ${imagename}