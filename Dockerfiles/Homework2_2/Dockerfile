FROM python:3
LABEL MAINTAINER="Volodymyr Lykhachov"
COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt
WORKDIR /flask
COPY app.py ./
COPY index.html ./templates/index.html
CMD [ "python", "./app.py" ]
EXPOSE 5000
