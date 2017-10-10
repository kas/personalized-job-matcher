from flask import Flask, jsonify, request
from models import Employer

app = Flask(__name__)

@app.route('/api/employers', methods=['GET'])
def employers():
    employers = None

    try:
        employers = Employer.select()
    except Employer.DoesNotExist:
        # TODO return error
        pass

    employer_list = []

    for employer in employers:
        employer_list.append(employer.name)

    json = jsonify(employer_list)

    return json

@app.route('/api/employers', methods=['POST'])
def web_sign_in():
    name = request.form['name']

    try:
        employer = Employer.get(Employer.name == name)
    except Employer.DoesNotExist:
        employer = Employer.create(name=name)

    return ('', 204)

@app.route('/api/employers/sign-in', methods=['POST'])
def sign_in():
    name = request.form['name']

    try:
        employer = Employer.get(Employer.name == name)
    except Employer.DoesNotExist:
        # TODO return error
        pass

    return ('', 204)
