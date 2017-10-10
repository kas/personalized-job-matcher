from flask import Flask, request
from models import Employer

app = Flask(__name__)

@app.route('/api/employers/sign-in', methods=['POST'])
def purchases():
    name = request.form['name']

    try:
        employer = Employer.get(Employer.name == name)
    except Employer.DoesNotExist:
        # return error

    return ('', 204)
