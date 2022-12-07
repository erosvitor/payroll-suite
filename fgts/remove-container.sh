#!/bin/bash

docker container stop fgts-payroll
docker container rm fgts-payroll
docker image rm fgts-payroll:1.0
