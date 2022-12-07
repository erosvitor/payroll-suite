#!/bin/bash

docker container stop gateway-payroll
docker container rm gateway-payroll
docker image rm gateway-payroll:1.0

