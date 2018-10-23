FROM python:3.4-alpine
WORKDIR /code
COPY ./hits/app.py ./requirements.txt ./
RUN mkdir -p logs && pip install -r requirements.txt
EXPOSE 5000
CMD ["python", "app.py"]
VOLUME /code/logs

