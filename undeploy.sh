#!/bin/bash

echo "--------------------------------------------------------------------------------"
echo "Starting undeploy..."
echo "--------------------------------------------------------------------------------"
echo ""

echo "Removing container of the IMPOSTOS service..."
echo "--------------------------------------------------------------------------------"
cd impostos
sh remove-container.sh
cd ..
echo ""

echo "Removing container of the INSS service..."
echo "--------------------------------------------------------------------------------"
cd inss
sh remove-container.sh
cd ..
echo ""

echo "Removing container of the FGTS service..."
echo "--------------------------------------------------------------------------------"
cd fgts
sh remove-container.sh
cd ..
echo ""

echo "Removing container of the EMPLOYEE service..."
echo "--------------------------------------------------------------------------------"
cd employee
sh remove-container.sh
cd ..
echo ""

echo "Removing container of the GATEWAY service..."
echo "--------------------------------------------------------------------------------"
cd gateway
sh remove-container.sh
cd ..
echo ""

echo "Removing container of the REGISTRY service..."
echo "--------------------------------------------------------------------------------"
cd registry
sh remove-container.sh
cd ..
echo ""

echo "Removing container of the DATABASE..."
echo "--------------------------------------------------------------------------------"
cd database
sh remove-container.sh
cd ..
echo ""

echo "Removing NETWORK..."
echo "--------------------------------------------------------------------------------"
cd network
sh remove-network.sh
cd ..
echo ""

echo "--------------------------------------------------------------------------------"
echo "Undeploy finished!"
echo "--------------------------------------------------------------------------------"

