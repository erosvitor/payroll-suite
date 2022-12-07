#!/bin/bash

docker container stop prometheus-payroll
docker container rm prometheus-payroll
docker image rm prometheus-payroll:1.0
