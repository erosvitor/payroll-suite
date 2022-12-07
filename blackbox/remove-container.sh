#!/bin/bash

docker container stop blackbox-payroll
docker container rm blackbox-payroll
docker image rm blackbox-payroll:1.0
