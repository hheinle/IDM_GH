# Base image ubuntu:latest
FROM ubuntu:latest
## do not ask for user input in installation process
ARG DEBIAN_FRONTEND=noninteractive
## getting updates
RUN apt-get -y update &&\
	## install git
	apt-get -y install git &&\
	## install R-packages
	apt-get -y install r-base &&\
	## clone project repository
	git clone https://github.com/hheinle/IDM_GH.git &&\
	## install missing R packages
	Rscript IDM_GH/org.xtext.idmGH.mlregDsl.tests/r_docker/r_install_packages.r
	## run the script
WORKDIR /IDM_GH/org.xtext.idmGH.mlregDsl.tests
RUN Rscript R_outputs/main.r
CMD Rscript ./R_outputs/main.r