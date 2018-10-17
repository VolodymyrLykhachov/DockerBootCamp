#!/bin/bash
#create network
docker network create --driver bridge testing_network
#start application container
docker run --name hits -t  -i  -v e:/logs:/flask/logs -p 5000:5000 --network testing_network --rm  violant/hits:h3
#start app test container
docker run --network testing_network violant/hits-at:h3