#!/bin/bash

docker container stop impostos-payroll
docker container rm impostos-payroll
docker image rm impostos-payroll:1.0
