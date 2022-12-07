#!/bin/bash

imagename="inss-payroll:1.0"
containername="inss-payroll"
volumedir="inss-payroll"

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
