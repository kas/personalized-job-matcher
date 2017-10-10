import os

if 'HEROKU' in os.environ:
    from urllib.parse import urlparse

    url = urlparse(os.environ['DATABASE_URL'])

    db_name = url.path[1:]
    db_host = url.hostname
    db_password = url.password
    db_user = url.username
else:
    db_name = 'postgres'
    db_host = 'localhost'
    db_user = 'postgres'

    docker_db_name = 'personalizedjobmatcherdb'
