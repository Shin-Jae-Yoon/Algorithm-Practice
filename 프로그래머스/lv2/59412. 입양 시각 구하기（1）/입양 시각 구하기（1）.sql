select hour(datetime) as HOUR, count(*)
from animal_outs
group by HOUR
having HOUR between 9 and 20
order by HOUR;