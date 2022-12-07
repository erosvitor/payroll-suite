#!/bin/bash

echo "--------------------------------------------------------------------------------"
echo "Starting deploy..."
echo "--------------------------------------------------------------------------------"
echo ""

echo "Creating network..."
echo "--------------------------------------------------------------------------------"
cd network
sh create-network.sh
cd ..
echo ""

echo "Creating database..."
echo "--------------------------------------------------------------------------------"
cd database
sh create-container.sh
cd ..
echo ""

echo "Creating container for REGISTRY service..."
echo "--------------------------------------------------------------------------------"
cd registry
sh create-container.sh
cd ..
echo ""

echo "Creating container for GATEWAY service..."
echo "--------------------------------------------------------------------------------"
cd gateway
sh create-container.sh
cd ..
echo ""

echo "Creating container for EMPLOYEE service..."
echo "--------------------------------------------------------------------------------"
cd employee
sh create-container.sh
cd ..
echo ""

echo "Creating container for FGTS service..."
echo "--------------------------------------------------------------------------------"
cd fgts
sh create-container.sh
cd ..
echo ""

echo "Creating container for INSS service..."
echo "--------------------------------------------------------------------------------"
cd inss
sh create-container.sh
cd ..
echo ""

echo "Creating container for IMPOSTOS service..."
echo "--------------------------------------------------------------------------------"
cd impostos
sh create-container.sh
cd ..
echo ""

echo "--------------------------------------------------------------------------------"
echo "Deploy finished!"
echo "--------------------------------------------------------------------------------"

