#!/bin/bash

imagename="employee-payroll:1.0"
containername="employee-payroll"
volumedir="employee-payroll"

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

