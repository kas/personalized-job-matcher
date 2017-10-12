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

    json = {'results': []}

    for employer in employers:
        json['results'].append(employer.name)

    response = jsonify(json)

    return response

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
