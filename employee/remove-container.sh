#!/bin/bash

docker container stop employee-payroll
docker container rm employee-payroll
docker image rm employee-payroll:1.0
