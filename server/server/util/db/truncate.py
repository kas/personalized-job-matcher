import os
import sys
sys.path.append(os.path.join(os.path.dirname(__file__), '..', '..'))

from models import Employer

query = Employer.delete()
query.execute()
