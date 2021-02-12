# Base image ubuntu:latest
FROM ubuntu:latest
## do not ask for user input in installation process
ARG DEBIAN_FRONTEND=noninteractive
## getting updates
RUN apt-get update &&\
	## install git
	apt-get install git &&\
	## install python-packages
	apt-get install python &&\
	apt-get install python-pip &&\
	## clone project repository
	git clone https://github.com/hheinle/IDM_GH.git &&\
	## install missing R packages
	pip install -r IDM_GH/org.xtext.idmGH.mlregDsl.tests/python_docker/python_requirements.txt
	## run the script
WORKDIR /IDM_GH/org.xtext.idmGH.mlregDsl.tests
RUN python python_outputs/main.py
CMD python ./python_outputs/main.py