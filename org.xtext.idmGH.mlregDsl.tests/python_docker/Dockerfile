FROM python:3.8-slim-buster

WORKDIR /../

COPY python_requirements.txt python_requirements.txt
RUN pip3 install -r python_requirements.txt

COPY . .

CMD ["python", /*.py]
