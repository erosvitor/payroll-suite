#!/bin/bash

imagename="registry-payroll:1.0"
containername="registry-payroll"
volumedir="registry-payroll"

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
  -p 8761:8761 \
  --name ${containername} \
  ${imagename}

