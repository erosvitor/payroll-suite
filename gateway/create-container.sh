#!/bin/bash

imagename="gateway-payroll:1.0"
containername="gateway-payroll"
volumedir="gateway-payroll"

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
  --name ${containername} \
  ${imagename}
