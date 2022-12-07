#!/bin/bash

docker container stop inss-payroll
docker container rm inss-payroll
docker image rm inss-payroll:1.0
