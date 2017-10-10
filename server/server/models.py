from peewee import *
import datetime
import os

if 'HEROKU' in os.environ:
    from config import db_host, db_name, db_password, db_user

    db = PostgresqlDatabase(db_name, host=db_host, password=db_password, user=db_user)
else:
    from config import db_host, db_name, db_user

    db = PostgresqlDatabase(db_name, host=db_host, user=db_user)

class BaseModel(Model):
    class Meta:
        database = db

class Employer(BaseModel):
    name = CharField()
