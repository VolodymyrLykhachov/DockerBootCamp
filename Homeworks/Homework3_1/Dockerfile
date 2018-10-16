FROM python:3.4
LABEL MAINTAINER="Volodymyr Lykhachov"
COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt
WORKDIR /flask
COPY ./hits/app.py ./app.py
CMD [ "python", "./app.py" ]
EXPOSE 5000
