#!/bin/bash

imagename="db-payroll:1.0"
containername="db-payroll"
volumedir="db-payroll"

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
  -p 3308:3306 \
  -e MYSQL_ROOT_PASSWORD=root \
  -v ${volumedir}:/var/lib/mysql \
  --name ${containername} \
  ${imagename}

