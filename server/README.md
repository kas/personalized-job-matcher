# personalized-job-matcher-server

## Requirements
* Python 3
* Docker
  * postgres image
    * `docker pull postgres`

## To make and start the database
`python make.py`

## To create the database tables
`python create.py`

## To drop the database tables
`python drop.py`

## To empty data from the database tables
`python truncate.py`

## To start the database
`python start.py`

## To stop the database
`python stop.py`

## To remove the database
`python rm.py`

Remove the database volume mounted at `server/db/`

## To see database contents
`python select_.py`

## To run the server
`export FLASK_APP=run.py`
`flask run`

## When first deploying to Heroku
`heroku config:set HEROKU=true`
