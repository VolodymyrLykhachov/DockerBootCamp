#!/bin/bash
#start application container
docker run --name homework3_1 -t  -i  -v e:/logs:/flask/logs -p 5000:5000 --rm  violant/hits:h3
#start app test container