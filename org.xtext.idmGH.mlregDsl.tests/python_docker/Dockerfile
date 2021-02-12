# Base image ubuntu:latest
FROM ubuntu:latest
## do not ask for user input in installation process
ARG DEBIAN_FRONTEND=noninteractive
## getting updates
RUN apt-get -y update &&\
	## install git
	apt-get -y install git &&\
	## install python-packages
	apt-get install -y python3-pip python-dev &&\
	pip3 install --upgrade setuptools &&\
	## clone project repository
	git clone https://github.com/hheinle/IDM_GH.git &&\
	## install missing R packages
	pip3 install -r IDM_GH/org.xtext.idmGH.mlregDsl.tests/python_docker/python_requirements.txt
	## run the script
WORKDIR /IDM_GH/org.xtext.idmGH.mlregDsl.tests
RUN python python_outputs/main.py
CMD python ./python_outputs/main.py