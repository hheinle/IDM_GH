# Base image https://hub.docker.com/u/rocker/
FROM rocker/r-base:latest

## create directories
##RUN mkdir -p /datasets
##RUN mkdir -p /R_outputs
##RUN mkdir -p /install_packages


## copy files
COPY .. .

## install R-packages
RUN Rscript /r_install_packages.r

## run the script
CMD ["R", "./*.r"]