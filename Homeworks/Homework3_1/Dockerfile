FROM python:3.4
LABEL MAINTAINER="Volodymyr Lykhachov"
WORKDIR /flask
COPY requirements.txt  ./hits/app.py ./app.py ./
RUN pip install --no-cache-dir -r requirements.txt
CMD [ "python", "./app.py" ]
EXPOSE 5000
VOLUME /flask/logs
