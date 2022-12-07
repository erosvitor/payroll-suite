#!/bin/bash

docker container stop db-payroll
docker container rm db-payroll
docker image rm db-payroll:1.0

