#!/bin/bash

imagename="fgts-payroll:1.0"
containername="fgts-payroll"
volumedir="fgts-payroll"

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
