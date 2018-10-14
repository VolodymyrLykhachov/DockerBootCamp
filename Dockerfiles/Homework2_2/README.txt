Required tools: 
    - python
    - pip

Application dependencies:
    pip install flask

Image requirements:
- '/flask' is a working directory (workdir)
- app.py is in the workdir
- index.html is in the workdir/templates
- 5000 port has to be exposed
- python app.py is a run command

Check you image:
- run command (ctrl+c to exit): docker run -it --rm -p 5000:5000 <image name> 
- open 'http://localhost:5000' in your browser 
- flask-app.png is what you have to see in your browser

