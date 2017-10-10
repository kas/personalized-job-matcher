import os
import sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..'))

from models import Employer
from peewee import *

if 'HEROKU' in os.environ:
    from config import db_host, db_name, db_password, db_user

    db = PostgresqlDatabase(db_name, host=db_host, password=db_password, user=db_user)
else:
    from config import db_host, db_name, db_user

    db = PostgresqlDatabase(db_name, host=db_host, user=db_user)

db.connect()

db.create_tables([Employer])
