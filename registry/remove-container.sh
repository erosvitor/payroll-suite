#!/bin/bash

docker container stop registry-payroll
docker container rm registry-payroll
docker image rm registry-payroll:1.0

