select count(*) as USERS
from user_info
where joined like '2021%'
and 20 <= age 
and age <= 29;