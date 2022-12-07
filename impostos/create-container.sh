#!/bin/bash

imagename="impostos-payroll:1.0"
containername="impostos-payroll"
volumedir="impostos-payroll"

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
